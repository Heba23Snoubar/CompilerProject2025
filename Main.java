import AST.AstNode;
import AST_H_C.Node;
import SymbolTable.Scope;
import grammers.flaskLexer;
import grammers.flaskParser;
import grammers.htmlLexer;
import grammers.htmlParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import visitor.HtmlVisitor;
import visitor.PythonVisitor;
import visitor.SymbolTableVisitor;
import visitor.WebSymbolTableVisitor;

import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        try {

            //     String filePath = "Files/index.html";
            //    String filePath = "Files/add_product.html";
            String filePath = "Files/product_details.html";




            String htmlCode = Files.readString(Paths.get(filePath));

            htmlLexer lexer = new htmlLexer(CharStreams.fromString(htmlCode));
            htmlParser parser = new htmlParser(new CommonTokenStream(lexer));
            HtmlVisitor visitor = new HtmlVisitor();
            Node ast = visitor.visitHtmlDocument(parser.htmlDocument());
             System.out.println(ast.toString());
            WebSymbolTableVisitor webST = new WebSymbolTableVisitor(filePath); // اسم ملف الـ html
            webST.build(ast);

            System.out.println("\n WEB SYMBOL TABLE");
            WebSymbolTableVisitor.printReport();

            CharStream input = CharStreams.fromFileName("Files/test.txt");
            flaskLexer py_lexer = new flaskLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(py_lexer);
            flaskParser py_parser = new flaskParser(tokens);
            flaskParser.ProgramContext tree = py_parser.program();
            if (parser.getNumberOfSyntaxErrors() > 0) {
                System.out.println("(Syntax Errors)");
                return;
            }
            PythonVisitor py_visitor = new PythonVisitor();
            AstNode root = py_visitor.visit(tree);

            SymbolTableVisitor pySTVisitor = new SymbolTableVisitor();
            pySTVisitor.build(root);
            System.out.println("\nPYTHON SYMBOL TABLE ");
            Scope.printFinalReport();

            System.out.println(" AST Output");
             System.out.println(root.toString());

        } catch (Exception e) {
            System.err.println("error " + e.getMessage());
            e.printStackTrace();
        }
    }
}