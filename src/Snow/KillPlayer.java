/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Snow;

import city.cs.engine.CollisionEvent;
import city.cs.engine.CollisionListener;

/**
 *
 * @author Sunil Cheema
 */
public class KillPlayer implements CollisionListener {

    private Caveman caveman;

    public KillPlayer(Caveman caveman) {
        this.caveman = caveman;

    }

    @Override
    public void collide(CollisionEvent e) {
        if (e.getOtherBody().getName() != null) {
            if (e.getOtherBody().getName().equals("Caveman")) {
                System.out.println("huhuj");
                e.getOtherBody().destroy();
                caveman.hitSpike();
            }
        }


    }
}
