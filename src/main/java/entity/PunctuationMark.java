package entity;

public class PunctuationMark implements SentencePart {
    char value;

    public PunctuationMark(char value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
