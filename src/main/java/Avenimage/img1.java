/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Avenimage;
import java.awt.*;
import java.applet.*;

/**
 *
 * @author HNC
 */
public class img1 extends Applet {
    Image pic;
    public void init()
    {
            pic=getImage(getDocumentBase(),"captainamerica.jpg");
        
    }
    public void paint(Graphics g)
    {
        g.drawImage(pic,1920,1860 , this);
    }
    

    public static void main(String args[])
    {
        
     img1 ob;
    }
    
}
