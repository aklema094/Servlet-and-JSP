/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.servletss;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

/**
 *
 * @author user
 */
public class Myservlet implements Servlet {
    
    ServletConfig conf;

    @Override
    public void init(ServletConfig sc) throws ServletException {
        this.conf = sc;
        System.out.println("Servlet starting");
    }

    @Override
    public ServletConfig getServletConfig() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void service(ServletRequest sr, ServletResponse sr1) throws ServletException, IOException {
        sr1.setContentType("text/html");
        PrintWriter out = sr1.getWriter();
        out.println("<h1> this is my out from servlet method</h1>");
        out.println("Today Date : "+new Date().toString());
        System.out.println("servlet processing............");
    }

    @Override
    public String getServletInfo() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void destroy() {
        System.out.println("servelt destroying");
    }
    
}
