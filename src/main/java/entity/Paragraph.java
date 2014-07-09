package entity;


import java.util.List;

public class Paragraph extends AbstractCompoundText<Sentence> implements TextPart {

    public Paragraph(List<Sentence> components) {
        super(components);
    }

    public List<Sentence> getListSentence() {
        return components;
    }

    @Override
    public String toString() {
        String result = "";
        for (Sentence component : components) {
            result += component.toString();
        }
        return result;
    }
}