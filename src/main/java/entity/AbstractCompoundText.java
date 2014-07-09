package entity;

import java.util.List;

/**
 * Created by Евгений on 09.07.2014.
 */
public class AbstractCompoundText<T extends TextPart> implements CompoundText {

    public List<T> components;

    protected AbstractCompoundText(List<T> components) {
        this.components = components;
    }
}
