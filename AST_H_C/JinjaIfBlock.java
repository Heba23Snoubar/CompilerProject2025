package AST_H_C;

import java.util.List;

public class JinjaIfBlock extends JinjaBlock{

    private List<HtmlElement> body;

    public JinjaIfBlock(String Name, int numberOfLine, List<HtmlElement> body) {
        super(Name, numberOfLine, body);
        this.body = body;
    }

    @Override
    public String toString() {
        return "JinjaIfBlock{" +
                "\n\tbody=" + body +
                "\n, Name='" + Name + '\'' +
                "\n, numberOfLine=" + numberOfLine +
                '}';
    }
}
