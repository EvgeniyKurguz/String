package entity;

import java.util.ArrayList;
import java.util.List;

public class AbstractCompoundText<T extends TextPart> implements CompoundText {

    public List<T> components;

    protected AbstractCompoundText() {
        components =new ArrayList<>();
    }

    public void add(Paragraph paragraph) {

    }

}