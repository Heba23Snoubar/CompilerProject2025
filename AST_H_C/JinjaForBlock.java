package AST_H_C;

import java.util.List;

public class JinjaForBlock extends JinjaBlock{

    public JinjaForBlock(String Name, int numberOfLine, List<HtmlElement> body) {
        super(Name, numberOfLine, body);
    }

    @Override
    public String toString() {
        return "JinjaForBlock{" +
                "body=" + body +
                ", Name='" + Name + '\'' +
                ", numberOfLine=" + numberOfLine +
                '}';
    }
}
