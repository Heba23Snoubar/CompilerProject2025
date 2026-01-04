import AST.AstNode;
import AST_H_C.Node;
import grammers.flaskLexer;
import grammers.flaskParser;
import grammers.htmlLexer;
import grammers.htmlParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import visitor.HtmlVisitor;
import visitor.PythonVisitor;

import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        try {
//===========================================HTML AST==================================
       //     String filePath = "Files/index.html";
       //    String filePath = "Files/add_product.html";
            String filePath = "Files/product_details.html";




            String htmlCode = Files.readString(Paths.get(filePath));



            // تحليل الكود
            htmlLexer lexer = new htmlLexer(CharStreams.fromString(htmlCode));
            htmlParser parser = new htmlParser(new CommonTokenStream(lexer));

            // بناء Visitor والزيارة
            HtmlVisitor visitor = new HtmlVisitor();
            Node ast = visitor.visitHtmlDocument(parser.htmlDocument());


//            ASTPrinter.print(ast);
//
//            ========================================python AST================================
            // 1. قراءة ملف الدخل
            // تأكد أن المسار يطابق مكان ملف test.txt
            CharStream input = CharStreams.fromFileName("Files/test.txt");

            // 2. إعداد الـ Lexer لتحويل النص إلى رموز (Tokens)
            flaskLexer py_lexer = new flaskLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(py_lexer);

            // 3. إعداد الـ Parser لبناء شجرة الإعراب (Parse Tree)
            flaskParser py_parser = new flaskParser(tokens);
            flaskParser.ProgramContext tree = py_parser.program(); // وليس statement()

            // تحقق سريع: هل توجد أخطاء في الإعراب؟
            if (parser.getNumberOfSyntaxErrors() > 0) {
                System.out.println("توجد أخطاء في بناء الجملة (Syntax Errors). راجع الكونسول.");
                return;
            }

            // 4. تشغيل الـ Visitor لتحويل Parse Tree إلى AST الخاصة بك
            PythonVisitor py_visitor = new PythonVisitor();
            AstNode root = py_visitor.visit(tree);

            // 5. طباعة النتيجة النهائية
            System.out.println("========== AST Output ==========");
            System.out.println(root.toString());
            // سيقوم هذا بطباعة هيكلية الشجرة بناءً على دوال toString التي كتبناها في كلاسات AST

        } catch (Exception e) {
            System.err.println("حدث خطأ: " + e.getMessage());
            e.printStackTrace();
        }
    }
}