package com.quest;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "LogicServlet", value = "/logic")
public class LogicServlet extends HttpServlet {
    @Override


    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Получаем текущую сессию
        HttpSession currentSession = req.getSession();

        String name = "";
        name = currentSession.getAttribute(name).toString();

        String numberOfTries = "";
        numberOfTries = currentSession.getAttribute(numberOfTries).toString();
        Integer nextTry;
        nextTry = Integer.parseInt(numberOfTries);
        nextTry++;
        currentSession.setAttribute("numberOfTries", nextTry);
        getServletContext().getRequestDispatcher("/index.jsp").forward(req, resp);

    }



}