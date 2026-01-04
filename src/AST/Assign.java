package AST;

public class Assign extends AstNode {
    private AstNode left;  //  (factor)
    private AstNode right; // (expression)

    public Assign(AstNode left, AstNode right, int linenumber) {

        super("Assignment", linenumber);
        this.left = left;
        this.right = right;
    }

    public AstNode getLeft() { return left; }
    public AstNode getRight() { return right; }

    @Override
    public String toString() {
        return "AssignNode{" +
                "left=" + (left != null ? left.nodename : "null") +
                ", right=" + (right != null ? right.nodename : "null") +
                ", line=" + linenumber +
                '}';
    }



}