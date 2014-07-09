package entity;

import java.util.List;

public class Word  extends AbstractCompoundText<Symbol> implements TextPart {

    private Type type;

    public Word(List<Symbol> components) {
        super(components);
    }

    public List<Symbol> getListSymbols() {
        return components;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public String toString() {
        String result = "";
        for (Symbol component : components) {
            result += component.toString();
        }
        return result;
    }

    public enum Type {
        WORD, SEPARATOR
    }
}

