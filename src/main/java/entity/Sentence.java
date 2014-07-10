package entity;

import java.util.List;

public class Sentence extends AbstractCompoundText<Word> implements TextPart {

    public Sentence() {
    }

    public void add(Sentence sentence) {

    }


    public void add(Word word) {

    }


    public void add(String symbSourceString) {

    }


    public void add(char[] chars) {

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
