package AST_H_C;

import AST.*;

import java.util.List;
import java.util.Map;

public class ASTPrinter {

    public static void print(Node node) {
        System.out.println("=== Abstract Syntax Tree (AST) ===");
        printNode(node, "", true);
        System.out.println("===================================");
    }

    private static void printNode(Node node, String prefix, boolean isLast) {
        // استخدام رموز ASCII بسيطة
        String connector = isLast ? "`-- " : "|-- ";
        String childPrefix = isLast ? "    " : "|   ";

        System.out.print(prefix + connector);
        printNodeInfo(node);

        String newPrefix = prefix + childPrefix;

        if (node instanceof HtmlTag) {
            printHtmlTag((HtmlTag) node, newPrefix);
        }
        else if (node instanceof HtmlText) {
            printHtmlText((HtmlText) node, newPrefix);
        }
        else if (node instanceof CSS_Style) {
            printCSSStyle((CSS_Style) node, newPrefix);
        }
        else if (node instanceof JinjaExpression) {
            printJinjaExpression((JinjaExpression) node, newPrefix);
        }
        else if (node instanceof JinjaTag) {
            printJinjaTag((JinjaTag) node, newPrefix);
        }
        else if (node instanceof CSSRuleSet) {
            printCSSRuleSet((CSSRuleSet) node, newPrefix);
        }
        else if (node instanceof CssProperty) {
            printCssProperty((CssProperty) node, newPrefix);
        }
    }

    private static void printNodeInfo(Node node) {
        String simpleName = node.getClass().getSimpleName();
        System.out.println(simpleName + " [Name: '" + node.getName() +
                "', Line: " + node.getNumberOfLine() + "]");
    }

    private static void printHtmlTag(HtmlTag tag, String prefix) {
        System.out.println(prefix + "|-- Tag: <" + tag.getTagName() + ">");

        // طباعة السمات
        List<HtmlAttribute> attributes = tag.getAttributes();
        if (attributes != null && !attributes.isEmpty()) {
            System.out.println(prefix + "|-- Attributes (" + attributes.size() + "):");
            for (int i = 0; i < attributes.size(); i++) {
                HtmlAttribute attr = attributes.get(i);
                boolean isLast = (i == attributes.size() - 1);
                String attrConnector = isLast ? "`-- " : "|-- ";
                System.out.println(prefix + "    " + attrConnector +
                        attr.getAttributeName() + " = \"" + attr.getAttributeValue() + "\"");
            }
        } else {
            System.out.println(prefix + "|-- No attributes");
        }

        // طباعة الأطفال
        if (!tag.getChildren().isEmpty()) {
            System.out.println(prefix + "`-- Children (" + tag.getChildren().size() + "):");
            for (int i = 0; i < tag.getChildren().size(); i++) {
                boolean isLast = (i == tag.getChildren().size() - 1);
                printNode(tag.getChildren().get(i), prefix + "    ", isLast);
            }
        } else {
            System.out.println(prefix + "`-- No children");
        }
    }

    private static void printHtmlText(HtmlText text, String prefix) {
        System.out.println(prefix + "`-- Content: \"" + text.getText() + "\"");
    }

    private static void printCSSStyle(CSS_Style style, String prefix) {
        System.out.println(prefix + "`-- CSS Rules (" + style.getRuleSets().size() + "):");
        for (int i = 0; i < style.getRuleSets().size(); i++) {
            boolean isLast = (i == style.getRuleSets().size() - 1);
            printNode(style.getRuleSets().get(i), prefix + "    ", isLast);
        }
    }

    private static void printCSSRuleSet(CSSRuleSet ruleSet, String prefix) {
        System.out.println(prefix + "|-- Selector: " + ruleSet.getSelector());
        System.out.println(prefix + "`-- Properties (" + ruleSet.getProperties().size() + "):");
        for (int i = 0; i < ruleSet.getProperties().size(); i++) {
            boolean isLast = (i == ruleSet.getProperties().size() - 1);
            printNode(ruleSet.getProperties().get(i), prefix + "    ", isLast);
        }
    }

    private static void printCssProperty(CssProperty prop, String prefix) {
        System.out.println(prefix + "`-- " + prop.getProperty() + ": " + prop.getValue());
    }

    private static void printJinjaExpression(JinjaExpression expr, String prefix) {
        System.out.println(prefix + "`-- Expression: {{ " + expr.getExpression() + " }}");
    }

    private static void printJinjaTag(JinjaTag tag, String prefix) {
        System.out.println(prefix + "|-- Tag: {% " + tag.getTagContent() + " %}");
        System.out.println(prefix + "`-- Body (" + tag.getBody().size() + "):");
        for (int i = 0; i < tag.getBody().size(); i++) {
            boolean isLast = (i == tag.getBody().size() - 1);
            printNode(tag.getBody().get(i), prefix + "    ", isLast);
        }
    }
}