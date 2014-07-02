package entity;

public class Symbol {
    String content;

    public Symbol(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return content;
    }
}
