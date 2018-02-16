//this code allows collison to occur
package Snow;

import city.cs.engine.*;
import org.jbox2d.common.Vec2;

/**
 * Collision listener that allows the bird to collect things.
 */
public class PickupPenguin implements CollisionListener {

    private Caveman caveman;
    private Game GD;

    public PickupPenguin(Caveman caveman, Game GD) {
        this.caveman = caveman;
        this.GD = GD;
    }

    @Override
    public void collide(CollisionEvent e) {
        if (e.getOtherBody().getName() != null) {
            if (e.getOtherBody().getName().equals("Caveman")) {
                e.getReceivingBody().destroy();
                GD.changeWorld1();

            }
        }
    }
}
