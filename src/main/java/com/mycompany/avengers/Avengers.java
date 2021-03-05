/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.avengers;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.*;
import java.io.*;

/**
 *
 * @author HNC
 */
public class Avengers extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Avengers</title>");            
            out.println("</head>");
            
            out.println("<body background='C:\\\\Users\\\\HNC\\\\Downloads\\\\2.jpg'>" +
"            <center><h1><font face=\"Times New Roman\" size=\"7\" color=#B768A2>AVENGERS</font></h1></center> " +
"            <p><font face=\"Comic Sans MS\" size=\"5\" color=#319177>The Avengers is a 2012 American superhero film based on the Marvel Comics superhero team of the same name. Produced by Marvel Studios and distributed by Walt Disney Studios Motion Pictures, it is the sixth film in the Marvel Cinematic Universe (MCU). Written and directed by Joss Whedon, the film features an ensemble cast including Robert Downey Jr., Chris Evans, Mark Ruffalo, Chris Hemsworth, Scarlett Johansson, and Jeremy Renner as the Avengers, alongside Tom Hiddleston, Clark Gregg, Cobie Smulders, Stellan Skarsgård, and Samuel L. Jackson. In the film, Nick Fury and the spy agency S.H.I.E.L.D. recruit Tony Stark, Steve Rogers, Bruce Banner, and Thor to form a team capable of stopping Thor's brother Loki from subjugating Earth.</p> " +
"            <br><br>" +
"            <center><img src=\"C:\\\\Users\\\\HNC\\\\Downloads\\\\avengers.jpg\" width=900 height=500></center>" +
"            <br><br>" +
"            Want to know more about avengers?" +
"            <br>" +
"            <a href=\"db.html\">Yes</a> " +
"            <a href=\"main.html\">No</a> " +
"            <br><br> " +
             "To download app," +
"            <a href=\"\"> click here</a>" +         
"            <br><br>To talk to Avenbot, " +
"            <a href=\"https://www.kommunicate.io/livechat-demo?appId=16867492604ea4d7b8d8379f94555fae1&botIds=avenbot-p4ewg&assignee=avenbot-p4ewg\">" +
"            click here</a>"+
"            </font></body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
//