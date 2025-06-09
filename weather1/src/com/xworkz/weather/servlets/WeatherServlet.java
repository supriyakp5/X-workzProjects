package com.xworkz.weather.servlets;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/weather",loadOnStartup = 1)
public class WeatherServlet extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        String location=servletRequest.getParameter("location");
        String captured=servletRequest.getParameter("captured");
        String temperature=servletRequest.getParameter("temperature");
        String recorded=servletRequest.getParameter("recorded");


        servletRequest.setAttribute("lac",location);
        servletRequest.setAttribute("cap",captured);
        servletRequest.setAttribute("tem",temperature);
        servletRequest.setAttribute("rec",recorded);






        RequestDispatcher dispatcher=servletRequest.getRequestDispatcher("weatherResult.jsp");
        dispatcher.forward(servletRequest,servletResponse);
    }
}
