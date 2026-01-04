package AST;

import java.util.List;

//public class IfStatement extends AstNode {
//    private AstNode condition;             // الشرط الأساسي
//    private List<AstNode> ifBlock;         // الأوامر داخل الـ if
//
//    // لإدارة الـ else if والـ else (يمكنك تبسيطها للمشروع)
//    private List<AstNode> elseIfConditions;
//    private List<List<AstNode>> elseIfBlocks;
//    private List<AstNode> elseBlock;       // الأوامر داخل الـ else
//
//    public IfStatement(AstNode condition, List<AstNode> ifBlock, int linenumber) {
//        super("IfStatement", linenumber);
//        this.condition = condition;
//        this.ifBlock = ifBlock;
//        this.elseIfConditions = new ArrayList<>();
//        this.elseIfBlocks = new ArrayList<>();
//        this.elseBlock = new ArrayList<>();
//    }
//
//    // تابع لإضافة else if (يستدعيه الـ Visitor)
//    public void addElseIf(AstNode cond, List<AstNode> block) {
//        this.elseIfConditions.add(cond);
//        this.elseIfBlocks.add(block);
//    }
//
//    // تابع لإضافة else (يستدعيه الـ Visitor)
//    public void setElseBlock(List<AstNode> block) {
//        this.elseBlock = block;
//    }
//
//    @Override
//    public String toString() {
//        StringBuilder sb = new StringBuilder();
//        sb.append("If (Line: ").append(linenumber).append(") Condition: [").append(condition.toString()).append("]");
//
//        if (ifBlock != null && !ifBlock.isEmpty()) {
//            sb.append(" {\n");
//            for (AstNode node : ifBlock) {
//                sb.append("         --> ").append(node.toString()).append("\n");
//            }
//            sb.append("      }");
//        }
//        // يمكن إضافة طباعة الـ else here بنفس الطريقة
//        return sb.toString();
//    }
//}
public class IfStatement extends AstNode {
    public IfStatement(AstNode condition, List<AstNode> body, int line) {
        super("If", line);
        addChild(condition);
        for (AstNode stmt : body) {
            addChild(stmt);
        }
    }
}
