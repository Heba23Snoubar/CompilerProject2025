package AST_H_C;

public class JinjaSingleTag  extends Node {

    public JinjaSingleTag(String Name, int numberOfLine) {
        super(Name, numberOfLine);
    }

    @Override
    public String toString() {
        return "JinjaSingleTag{" +
                "Name='" + Name + '\'' +
                ", numberOfLine=" + numberOfLine +
                '}';
    }
}
