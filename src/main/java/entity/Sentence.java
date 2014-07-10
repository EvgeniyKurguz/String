package entity;

import java.util.List;

public class Sentence extends AbstractCompoundText<Word> implements TextPart {

    public Sentence(List<Word> components) {
        super(components);
    }

    public List<Word> getListWord() {
        return components;
    }

    @Override
    public String toString() {
        String result = "";
        for (Word component : components) {
            result += component.toString();
        }
        return result;
    }
}
