/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author HNC
 */
public class Quest extends HttpServlet {

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
        try ( PrintWriter pw = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
        pw.println("<!DOCTYPE html>");
        pw.println("<html><body background='C:\\Users\\HNC\\Downloads\\2.jpg'><font face=\"Comic Sans MS\" size=\"5\" color=#319177>Enter your name");
        String name= request.getParameter("name");
        pw.println("Enter your e-mail id");
        String id=request.getParameter("id");
        pw.println("Enter number of yur favourite avenger");
        String num=request.getParameter("num");
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://localhost:8080/";
            String user="Divija";
            String password="12345";
            Connection con=DriverManager.getConnection(url,user,password);
            String query="Insert into Avenger Data(name,id,num) values (?,?,?)";
            PreparedStatement stm=con.prepareStatement(query);
            stm.setString(1,name);
            stm.setString(2,id);
            stm.setString(3,num);
            pw.println("<button onClick=stm.executeUpdate()>OK</button>");
            if(stm.executeUpdate()==1)
            {
                
                switch(num)
                {
                    case "IronMan" : IronMan obj= new IronMan();
                    break;
                    case "CaptainAmerica":CaptainAmerica obj1 = new CaptainAmerica();
                    break;
                    case "Thor":Thor obj2 = new Thor();
                    break;
                    case "Hulk":Hulk obj3 = new Hulk();
                    break;
                    case "BlackWidow":BlackWidow obj4 = new BlackWidow();
                    break;
                    case "HawkEye":HawkEye obj5 = new HawkEye();
                    break;
                    case "ScarlettWitch":ScarlettWitch obj6 = new ScarlettWitch();
                    break;
                    case "Vision":Vision obj7 = new Vision();
                    break;
                    case "DrStrange":DrStrange obj8 = new DrStrange();
                    break;
                    case "BlackPanther":BlackPanther obj9 = new BlackPanther();
                    break;
                    case "CaptainMarvel":CaptainMarvel obj10 = new CaptainMarvel();
                    break;
                    case "SpiderMan":SpiderMan obj11 = new SpiderMan();
                    break;
                    default : pw.println("No match found");

                }
                pw.println("</font></body></html>");

            }

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        pw.close();
            
        }
        
    }
    
}

    