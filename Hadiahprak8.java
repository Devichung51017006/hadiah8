package hadiahprak8;

import java.awt.*;
public class Hadiahprak8 extends Panel{
        Hadiahprak8(){
            setBackground(Color.LIGHT_GRAY);
        }
    public void paint(Graphics g) {
        //buat badan mobil
        g.setColor(Color.YELLOW);
        g.fillRect(100, 180, 400, 180);
        g.setColor(Color.YELLOW);
        g.fillRect(500, 250, 100, 110);
        
        //buat roda mobil
        g.setColor(Color.BLACK);
        g.fillRoundRect(142, 330, 100, 100,100,100);
        g.setColor(Color.BLACK);
        g.fillRoundRect(400, 330, 100, 100,100,100);
        g.setColor(Color.BLACK);
        g.drawOval(142, 330, 100, 100);
        g.drawOval(400, 330, 100, 100);
        g.drawOval(399, 330, 100, 100);
        
        //buat pintu mobil
        g.setColor(Color.BLUE);
        g.fillRect(240, 250, 130, 110);
        g.setColor(Color.BLACK);
        g.fillOval(310, 280, 50, 50);
        
        //buat kalimat keren :D
        g.setColor(Color.BLACK);
        Font f = new Font("Times New Roman", Font.BOLD,25);
        FontMetrics fm = getFontMetrics(f);
        g.setFont(f);
        String nm = "My First Car by Devi Chungiarto";
        g.drawString(nm, 150, 490);
             
    }
    public static void main(String[] args) {
        Frame f = new Frame("Mobil");
       Hadiahprak8 gp = new Hadiahprak8();
       f.add(gp);
        f.setSize(900, 900);
        f.setVisible(true);
    }
}
    

