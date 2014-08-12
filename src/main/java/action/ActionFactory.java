package action;

import java.util.HashMap;
import java.util.Map;


public class ActionFactory {
    private Map<String, Action> actionMap = new HashMap<String, Action>();

    public ActionFactory(Map<String, Action> actionMap) {
        this.actionMap = actionMap;
    }

    public Action getAction(String actionName) {
        return actionMap.get(actionName);
    }
}
