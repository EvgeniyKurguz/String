package entity;

public class Symbol implements TextPart {
    private String symbol;

    public Symbol(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return symbol;
    }
}
