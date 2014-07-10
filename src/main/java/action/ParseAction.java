package action;


import entity.Text;
import parser.Parser;

import javax.servlet.http.HttpServletRequest;


public class ParseAction implements Action {

    @Override
    public String execute(HttpServletRequest request) {
        Parser parser = new Parser();
        String sourceText = request.getParameter("text");
        Text text = parser.parseText(sourceText);
        request.setAttribute("texttext", text);
        return "/WEB-INF/result.jsp";
    }
}
