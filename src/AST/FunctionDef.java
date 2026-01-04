package AST;

import java.util.List;

public class FunctionDef extends AstNode {
    private String functionName;      // اسم التابع
    private List<String> parameters;  // قائمة أسماء البارامترات (IDs)
    private List<AstNode> body;       // قائمة التعليمات داخل التابع

    public FunctionDef(String functionName, List<String> parameters, List<AstNode> body, int linenumber) {
        super("FunctionDefinition", linenumber);
        this.functionName = functionName;
        this.parameters = parameters;
        this.body = body;
    }

    // Getters
    public String getFunctionName() { return functionName; }
    public List<String> getParameters() { return parameters; }
    public List<AstNode> getBody() { return body; }

    @Override
    public String toString() {
        return "FunctionDefNode (Line: " + linenumber + ") [Name: " + functionName +
                ", Params: " + parameters.toString() + "]";
    }
}