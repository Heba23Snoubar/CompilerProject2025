package AST_H_C;

public class JinjaExpression extends HtmlElement{

    private String Expression;
//    private ExprNode expressionTree; // يمكنك توسيع هذا لاحقاً


    public JinjaExpression(String Name, int numberOfLine, String Expression) {
        super(Name, numberOfLine);
        this.Expression = Expression;
    }

    public String getExpression() {
        return Expression;
    }

    public void setExpression(String expression) {
        Expression = expression;
    }

    @Override
    public String toString() {
        return "JinjaExpression{" +
                "Expression='" + Expression + '\'' +
                ", Name='" + Name + '\'' +
                ", numberOfLine=" + getNumberOfLine() +
                '}';
    }
}
