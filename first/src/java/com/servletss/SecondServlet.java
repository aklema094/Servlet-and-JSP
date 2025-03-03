
package com.servletss;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author user
 */
public class SecondServlet  extends GenericServlet{

    @Override
    public void service(ServletRequest sr, ServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<h2> this is second servelt</h1>");
        
    }
    
}
