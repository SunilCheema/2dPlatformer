//this code allows collison to occur

package Snow;

import city.cs.engine.*;

/**
 
 */

//The class which allows the platform to be destroyed by the snowball
public class DestroyPlatform implements CollisionListener {
    private Game GD;
    private Body platform;
    
    
    public DestroyPlatform(Game GD,Body platform) {
        this.platform = platform;
        this.GD = GD;
    }
//overrides the collide class to destroy the platform
    @Override
    public void collide(CollisionEvent e) {
        if (e.getOtherBody() == platform) {       
            platform.destroy();
            System.out.println("Collision");
        }
        }
    }
    


