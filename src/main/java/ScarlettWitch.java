/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author HNC
 */
public class ScarlettWitch extends HttpServlet {

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
            out.println("<title>Servlet ScarlettWitch</title>");            
            out.println("</head>");
            out.println("<body background='C:\\Users\\HNC\\Downloads\\2.jpg'>");
            out.println("<center><font type=\"Times New Roman\" size=\"7\" color=#0081AB>SCARLETT WITCH</font></center>"); 
            out.println("<p><font type=\"Comic Sans MS\" size=\"5\" color=#B768A2>Wanda Maximoff is a native of Sokovia who grew up with her fraternal twin brother, Pietro. In an effort to help purge their country of strife, the twins joined HYDRA and agreed to undergo experiments with the Scepter under the supervision of Wolfgang von Strucker. The two received superpowers as a result, with Wanda attaining various abilities including telekinesis, telepathy, and reality manipulation. When HYDRA fell, the twins joined Ultron to get their revenge on Tony Stark over his weapons killing their family in a bombing, but eventually abandoned him when they discovered Ultron's true intentions to destroy Earth. Wanda and Pietro fought with the Avengers during the Battle of Sokovia to stop Ultron; Pietro was killed during the battle but Wanda survived, and shortly after Ultron's destruction, became a member of the Avengers.</p>"); 
            out.println("<br><br>"); 
            out.println("<center><img src='C:\\Users\\HNC\\Downloads\\scarlettwitch.jpg'></center>"); 
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
