package action;

import entity.Paragraph;
import entity.Sentence;
import entity.Symbol;
import entity.Word;

import javax.servlet.http.HttpServletRequest;
import java.util.List;


public class ParseAction implements Action {
    @Override
    public String execute(HttpServletRequest request) {
        String sourceText = request.getParameter("text");

        List<Symbol> symbols = Parser.parseToSymbols(sourceText);
        request.setAttribute("parseToSymbols", symbols);

       return "/WEB-INF/result.jsp";
    }
}
