package hadiahteori8;

import java.awt.*;
public class Hadiahteori8 extends Panel{
        Hadiahteori8(){
            setBackground(Color.PINK);
        }
    public void paint(Graphics g) {
        //buat badan
        g.drawLine(175, 280, 175, 160);
        //buatkaki
        g.drawLine(155, 280,175,250 );
        g.drawLine(195, 280,175,250 );
        
        //buattangan
        g.drawLine(140, 210, 175, 200);
        g.drawLine(215, 210, 175, 200);
        
        //buat kepala dan cepolan
        g.drawRoundRect(145, 103, 60 , 60,60, 60);
        g.drawRoundRect(145, 75, 30, 30,30, 30);
        
        //buat mata dan mulut dan kacamata
        g.drawRoundRect(160, 125, 12, 10,10, 10);
        g.drawRoundRect(177, 125, 12, 10,10, 10);
        g.drawRoundRect(155, 120, 20, 20,20, 20);
        g.drawLine(145, 130, 155, 130);
        g.drawRoundRect(175, 120, 20, 20,20, 20);
        g.drawLine(195, 130, 205, 130);
        g.drawArc(145, 140, 130, 60, -20, 20);
        
      
    }
    public static void main(String[] args) {
        Frame f = new Frame("diriku");
       Hadiahteori8 gp = new Hadiahteori8();
       f.add(gp);
        f.setSize(900, 900);
        f.setVisible(true);
    }
}
    

