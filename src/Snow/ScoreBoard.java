package Snow;

import city.cs.engine.*;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;

public class ScoreBoard extends UserView {

    Caveman caveman;
    Image backgroundImage;

    public ScoreBoard(World world, Caveman caveman, int width, int height) {
        super(world, width, height);
        this.caveman = caveman;
        this.backgroundImage = backgroundImage;
    }
    public void paintBackground(Graphics2D g){
        g.drawImage(backgroundImage, 0,0, this);
        backgroundImage = new ImageIcon("Data/icy2.jpg").getImage();
    }
    
    
    public void paintForeground(Graphics2D g){
        g.setColor(Color.white);
        g.drawString("Score:" + caveman.getCount(), 10, 10);
        
    }
}
