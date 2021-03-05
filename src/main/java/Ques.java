/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HNC
 */
import java.io.*;
import java.sql.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;
import javax.servlet.*;
@WebServlet("/AvengersPart")
public class Ques extends HttpServlet{
    public Ques(){
        super();
    }
   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
        response.getWriter().append("Served at:").append(request.getContextPath());
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException , IOException{
        PrintWriter pw;
        response.setContentType("text/html");
        pw=response.getWriter();
        pw.println("Enter your name");
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
            pw.println("<button>OK" + stm.executeUpdate()+"</button></font></body></html>");
            if(stm.executeUpdate()==1)
            {
                pw.println("Redirecting to your favourite avenger");
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
             

            }

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        pw.close();
    }
    public static void main(String args[])
    {
        Ques obj;
        
    }

    
}
