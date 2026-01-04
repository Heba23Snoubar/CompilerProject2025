package AST;

import java.util.ArrayList;
import java.util.List;

public class ForStatement extends AstNode {
    private String iteratorId;
    private AstNode iterable;
    private List<AstNode> body;

    public ForStatement(String iteratorId, AstNode iterable, List<AstNode> body, int linenumber) {
        super("ForStatement", linenumber);
        this.iteratorId = iteratorId;
        this.iterable = iterable;
        this.body = body;
    }

    public String getIteratorId() { return iteratorId; }
    public AstNode getIterable() { return iterable; }
    public List<AstNode> getBody() { return body; }

    @Override
    public String toString() {
        return "ForNode (Line: " + linenumber + ") [Iter: " + iteratorId + " in " + iterable.nodename + "]";
    }
}