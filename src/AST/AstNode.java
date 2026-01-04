package AST;

import java.util.ArrayList;
import java.util.List;

public abstract class AstNode {
    protected String nodename;
    protected int linenumber;
    protected List<AstNode> children;

    public AstNode(String nodename, int linenumber) {
        this.nodename = nodename;
        this.linenumber = linenumber;
        this.children = new ArrayList<>();
    }

    public void addChild(AstNode child) {
        if (child != null) {
            this.children.add(child);
        }
    }

}
