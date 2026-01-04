package AST;

public class BinaryExpression extends AstNode {
    private AstNode left;      // الطرف الأيسر (مثلاً: x)
    private String operator;   // عامل العملية (مثلاً: "+")
    private AstNode right;     // الطرف الأيمن (مثلاً: 5)

    public BinaryExpression(AstNode left, String operator, AstNode right, int linenumber) {
        // نمرر نوع العقدة "BinaryExpression" ورقم السطر للأب
        super("BinaryExpression", linenumber);
        this.left = left;
        this.operator = operator;
        this.right = right;
    }

    // Getters للوصول للبيانات أثناء التحليل الدلالي (Semantic)
    public AstNode getLeft() { return left; }
    public String getOperator() { return operator; }
    public AstNode getRight() { return right; }

    @Override
    public String toString() {
        return "BinaryExpression (Line: " + linenumber + ") [" +
                (left != null ? left.nodename : "?") + " " +
                operator + " " +
                (right != null ? right.nodename : "?") + "]";
    }
}