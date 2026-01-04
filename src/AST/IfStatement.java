package AST;

import java.util.ArrayList;
import java.util.List;

public class IfStatement extends AstNode {
    private AstNode condition;             // الشرط الأساسي
    private List<AstNode> ifBlock;         // الأوامر داخل الـ if

    // لإدارة الـ else if والـ else (يمكنك تبسيطها للمشروع)
    private List<AstNode> elseIfConditions;
    private List<List<AstNode>> elseIfBlocks;
    private List<AstNode> elseBlock;       // الأوامر داخل الـ else

    public IfStatement(AstNode condition, List<AstNode> ifBlock, int linenumber) {
        super("IfStatement", linenumber);
        this.condition = condition;
        this.ifBlock = ifBlock;
        this.elseIfConditions = new ArrayList<>();
        this.elseIfBlocks = new ArrayList<>();
        this.elseBlock = new ArrayList<>();
    }

    // تابع لإضافة else if (يستدعيه الـ Visitor)
    public void addElseIf(AstNode cond, List<AstNode> block) {
        this.elseIfConditions.add(cond);
        this.elseIfBlocks.add(block);
    }

    // تابع لإضافة else (يستدعيه الـ Visitor)
    public void setElseBlock(List<AstNode> block) {
        this.elseBlock = block;
    }

    @Override
    public String toString() {
        return "IfNode (Line: " + linenumber + ") [Condition: " + condition.nodename + "]";
    }
}