package action;

import entity.Text;

import javax.servlet.http.HttpServletRequest;


public class ParseAction implements Action {
    @Override
    public String execute(HttpServletRequest request) {
        String text = request.getParameter("textaria");

        request.setAttribute("text", text);
        return "WEB-INF/index.jsp";
    }
}
