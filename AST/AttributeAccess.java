//package AST;
//
//public class AttributeAccess extends AstNode {
//    private AstNode object; // الكائن (مثلاً request)
//    private String attribute; // الخاصية (مثلاً form)
//
//    public
//    (AstNode object, String attribute, int linenumber) {
//        super("AttributeAccess", linenumber);
//        this.object = object;
//        this.attribute = attribute;
//    }
//
//    @Override
//    public String toString() {
//        return object.toString() + "." + attribute;
//    }
//}
package AST;

public class AttributeAccess extends AstNode {

    private final AstNode target;
    private final String attribute;

    public AttributeAccess(AstNode target, String attribute, int line) {
        super("Attribute(" + attribute + ")", line);
        this.target = target;
        this.attribute = attribute;

        addChild(target);
    }
}
