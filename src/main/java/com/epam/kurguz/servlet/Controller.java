package com.epam.kurguz.servlet;

import action.Action;
import action.ActionFactory;
import action.ParseAction;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


public class Controller extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");

        Map<String, Action> actionMap = new HashMap< String, Action>();
        actionMap.put("parse", new ParseAction());
        ActionFactory actionFactory = new ActionFactory(actionMap);
        String result = actionFactory.getAction("parse").execute(request);

        request.getRequestDispatcher(result).forward(request, response);

        request.getRequestDispatcher("/WEB-INF/result.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
