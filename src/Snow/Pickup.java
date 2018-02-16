//this code allows collison to occur

package Snow;

import city.cs.engine.*;
import org.jbox2d.common.Vec2;

/**
 * Collision listener that allows the bird to collect things.
 */
public class Pickup implements CollisionListener {
    private Caveman caveman;
    private Game GD;
    private int level;
    public Pickup(Caveman caveman, Game GD, int level) {
        this.caveman = caveman;
        this.GD = GD;
        this.level = level;
    }

    @Override
    public void collide(CollisionEvent e) {
        if (e.getOtherBody() == caveman) {
            e.getReceivingBody().destroy();
            caveman.addOne();         
            if((caveman.getCount()== 10) && (level == 1)){
                GD.changeWorld();
            }
        }
    }
    
}
