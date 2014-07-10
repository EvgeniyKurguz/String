package entity;

import java.util.List;

public class AbstractCompoundText<T extends TextPart> implements CompoundText {

    public List<T> components;

    protected AbstractCompoundText(List<T> components) {
        this.components = components;
    }
}
