package com.xworkz.height.servlet;


import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;


 @WebServlet (urlPatterns="/water1", loadOnStartup=1)
 public class webapp extends GenericServlet {
     public webapp(){
         System.out.println("webapp created by tomcat");
     }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {

    }
}
