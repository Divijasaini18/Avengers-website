/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author HNC
 */
@WebServlet(urlPatterns = {"/Hulk"})
public class Hulk extends HttpServlet {

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
            out.println("<title>Servlet Hulk</title>");            
            out.println("</head>");
            out.println("<body background='C:\\Users\\HNC\\Downloads\\2.jpg'>");
            out.println("<center><font type=\"Times New Roman\" size=\"7\" color=#0081AB>HULK</font></center>"); 
            out.println("<p><font type=\"Comic Sans MS\" size=\"5\" color=#B768A2>Hulk (also known as The Hulk) is an American superhero based on the Marvel Comics character. Eric Bana stars as Bruce Banner/Hulk. The film explores the origins of Bruce Banner. After a lab accident involving gamma radiation, he finds himself able to turn into a giant green-skinned creature whenever emotionally provoked or stressed. The United States military pursues him, and he comes into conflict with his biological father, who has a dark plan for his son.</p>"); 
            out.println("<br><br>"); 
            out.println("<center><img src='C:\\Users\\HNC\\Downloads\\hulk.jpg'></center>"); 
            out.println("<br><br>"); 
            out.println("To go back, "); 
            out.println("<a href=\"main.html\"> click here</a></font>");
            out.println("</body>");
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
