package entity;


import java.util.List;

public class Paragraph extends AbstractCompoundText<Sentence> implements TextPart {

    public Paragraph() {
    }

    public void add(Sentence sentence) {

    }

    public void add(Word word) {

    }


    public void add(String symbSourceString) {

    }


    public void add(char[] chars) {

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
