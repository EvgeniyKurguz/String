package entity;

import java.util.List;

public class Word extends AbstractCompoundText<Symbol> implements SentencePart {

    public Word() {
    }


    public void add(Sentence sentence) {

    }


    public void add(Word word) {

    }


    public void add(String symbSourceString) {

    }


    public void add(char[] chars) {

    }

    public List<Symbol> getListSymbols() {
        return components;
    }

    @Override
    public String toString() {
        String result = "";
        for (Symbol component : components) {
            result += component.toString();
        }
        return result;
    }

}

