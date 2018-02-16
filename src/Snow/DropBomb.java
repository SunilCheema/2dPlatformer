package Snow;

import city.cs.engine.*;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

//Extension of mouseadapter to allow a snowball bomb to drop after a click
public class DropBomb extends MouseAdapter {

    //variables declare
    private WorldView view;
    private Game GD;
    private Caveman cv;
    private Body platform;
    
    //allows the platform to be destroyed after the snowball bomb is dropped
    public DropBomb(WorldView view,Body platform) {
        this.view = view;
        this.cv = cv;
        this.platform = platform;
    }
//overrides the mousepressed class to create a new snowball from a click
    @Override
    public void mousePressed(MouseEvent e) {
        DynamicBody ball = new Snowball(view.getWorld(),3);
        ball.setPosition(view.viewToWorld(e.getPoint()));
        ball.addCollisionListener(new DestroyPlatform(GD,platform));
    }
}
