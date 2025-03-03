/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.servletss;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author user
 */
public class ThirdServlet extends HttpServlet {
    
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException,IOException {
        
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<h1> this is http servlet </h1>");
        
        
        
        
    }
    
}
