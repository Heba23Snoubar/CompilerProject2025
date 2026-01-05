package AST_H_C;



import java.util.List;

public class HtmlTag extends HtmlElement {



    String tagName;
    private List<HtmlAttribute> attributes;
    List<HtmlElement> children;

    public HtmlTag(String Name, int numberOfLine, String tagName, List< HtmlAttribute> attributes, List<HtmlElement> children) {
        super(Name, numberOfLine);
        this.tagName = tagName;
        this.attributes = attributes;
        this.children = children;
    }


    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public List< HtmlAttribute> getAttributes() {
        return attributes;
    }

    public void setAttributes(List< HtmlAttribute> attributes ) {
        this.attributes = attributes;
    }

    public List<HtmlElement> getChildren() {
        return children;
    }

    public void setChildren(List<HtmlElement> children) {
        this.children = children;
    }

    @Override
    public String toString() {
        return "HtmlTag{" +
                "\n\ttagName='" + tagName + "\n" +
                "\t, attributes=" + attributes+ "\n"+
                "\t, children=\n\t\t" + children +""+
                '}';
    }
}
