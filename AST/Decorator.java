//package AST;
//import java.util.List;
//
//public class Decorator extends AstNode {
//    private String name; // مثل app.route
//    private List<AstNode> args; // المدخلات مثل "/"
//
//    public Decorator(String name, List<AstNode> args, int linenumber) {
//        super("Decorator", linenumber);
//        this.name = name;
//        this.args = args;
//    }
//
//    @Override
//    public String toString() {
//        return "@" + name + " Args: " + (args != null ? args.toString() : "None");
//    }
//}
package AST;

import java.util.List;

public class Decorator extends AstNode {

    public Decorator(String name, List<AstNode> args, int line) {
        super("Decorator(@" + name + ")", line);

        if (args != null) {
            for (AstNode arg : args) {
                addChild(arg);
            }
        }
    }
}
