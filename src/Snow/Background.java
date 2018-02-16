package Snow;

import city.cs.engine.UserView;
import city.cs.engine.World;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
*
* @author Sunil Cheema
*/


public class Background extends UserView{

private Image backgroundImage;
public Background(World world, int width, int height){
super(world, width, height);
backgroundImage = new ImageIcon("data/icy2.jpg").getImage();

}
@Override
protected void paintBackground(Graphics2D g){
g.drawImage(backgroundImage, 0, 0, this);
}

}
