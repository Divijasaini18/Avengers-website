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
import java.sql.*;
import java.util.*;
import com.mycompany.avengers.Aven;

/**
 *
 * @author HNC
 */
public class db extends HttpServlet {
     

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
           
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet db</title>");            
            out.println("</head>");
            out.println("<body background='C:\\Users\\HNC\\Downloads\\2.jpg'><font face=\"Comic Sans MS\" size=\"5\" color=#319177>");
           
            String name=request.getParameter("name");
            String id=request.getParameter("id");
            String avn=request.getParameter("avenger");
            Connection con=DbConxn.initializeDatabase();
            String query="Insert into Aven(name,id,avn)values(?,?,?)";
            PreparedStatement stm=con.prepareStatement(query);
            stm.setString(1,name);
            stm.setString(2,id);
            stm.setString(3,avn);
            out.println("Successfully inserted");
            out.println("<div>Redirecting to your favorite avenger.... </div>");
            if(avn.equals("Iron Man"))
            {
                out.println("<a href=\"IronMan.html\">OK</a>");
            }
            else if(avn.equals("Captain America"))
            {
                out.println("<a href=\"CaptainAmerica.html\">OK</a>");
            }
            else if(avn.equals("Black Panther"))
            {
                out.println("<a href=\"BlackPanther.html\">OK</a>");
            }
            else if(avn.equals("Black Widow"))
            {
                out.println("<a href=\"BlackWidow.html\">OK</a>");
            }
            else if(avn.equals("Captain Marvel"))
            {
                out.println("<a href=\"CaptainMarvel.html\">OK</a>");
            }
            else if(avn.equals("Dr. Strange"))
            {
                out.println("<a href=\"DrStrange.html\">OK</a>");
            }
            else if(avn.equals("Hawk Eye"))
            {
                out.println("<a href=\"HawkEye.html\">OK</a>");
            }
            else if(avn.equals("Hulk"))
            {
                out.println("<a href=\"Hulk.html\">OK</a>");
            }
            else if(avn.equals("Scarlett Witch"))
            {
                out.println("<a href=\"ScarlettWitch.html\">OK</a>");
            }
            else if(avn.equals("Spider Man"))
            {
                out.println("<a href=\"SpiderMan.html\">OK</a>");
            }
            else if(avn.equals("Thor"))
            {
                out.println("<a href=\"Thor.html\">OK</a>");
            }
            else if(avn.equals("Vision"))
            {
                out.println("<a href=\"Vision.html\">OK</a>");
            }
                /*{
                    case "IronMan" : out.println("<a href=\"IronMan.html\">OK</a>");
                    break;
                    case "CaptainAmerica":out.println("<a href=\"CaptainAmerica.html\">OK</a>");
                    break;
                    case "Thor":out.println("<a href=\"Thor.html\">OK</a>");
                    break;
                    case "Hulk":out.println("<a href=\"Hulk.html\">OK</a>");
                    break;
                    case "BlackWidow":out.println("<a href=\"BlackWidow.html\">OK</a>");
                    break;
                    case "HawkEye":out.println("<a href=\"HawkEye.html\">OK</a>");
                    break;
                    case "ScarlettWitch":out.println("<a href=\"ScarlettWitch.html\">OK</a>");
                    break;
                    case "Vision":out.println("<a href=\"Vision.html\">OK</a>");
                    break;
                    case "DrStrange":out.println("<a href=\"DrStrange.html\">OK</a>");
                    break;
                    case "BlackPanther":out.println("<a href=\"BlackPanther.html\">OK</a>");
                    break;
                    case "CaptainMarvel":out.println("<a href=\"CaptainMarvel.html\">OK</a>");
                    break;
                    case "SpiderMan":out.println("<a href=\"SpiderMan.html\">OK</a>");
                    break;
                    default : out.println("No match found");
                }*/
            stm.executeUpdate();
            
            //<a href='\\display'>Click here</a>
            
            out.println("</font></body>");
            out.println("</html>");
            stm.close();
            con.close();
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
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
