package Snow;

import city.cs.engine.*;
import java.awt.Color;
import org.jbox2d.common.Vec2;

/**
 *
 * @author Sunil Cheema
 */
public class GameWorld extends World {
    private Caveman caveman;
    private Thesnowball grenade;
    private Game AR;
    
    public GameWorld(Game GD) {
        super();
        this.AR=AR;
        
        { // to make the foundation of the platform
            Shape shape = new BoxShape(20, 0.5f);
            Body ground = new StaticBody(this, shape);
            ground.setPosition(new Vec2(0, -11.5f));
            
        }

        { // these are the platforms used, where the player is able to jump on it
            Shape shape = new BoxShape(6, 0.5f);
            Body platform1 = new StaticBody(this, shape);
            platform1.setPosition(new Vec2(-7, 7.5f));
            platform1.setFillColor(Color.blue);
            Body platform2 = new StaticBody(this, shape);
            platform2.setPosition(new Vec2(5, 7.5f));
            platform2.setFillColor(Color.blue);
            Body platform3 = new StaticBody (this, shape);
            platform3.setPosition(new Vec2(20,-2f));
            platform3.setFillColor(Color.blue);
            Body platform4 = new StaticBody (this, shape);
            platform4.setPosition(new Vec2(-20,-2f));
            platform4.setFillColor(Color.blue);
            Body platform5 = new StaticBody (this, shape);
            platform5.setPosition(new Vec2(-20,16f));
            platform5.setFillColor(Color.blue);
            Body platform6 = new StaticBody (this, shape);
            platform6.setPosition(new Vec2(20,16f));
            platform6.setFillColor(Color.blue);
        }

        { // code for the charcter
            caveman = new Caveman(this);
            caveman.setPosition(new Vec2(8, -10));
        }
        {
        grenade = new Thesnowball(this);
        grenade.setPosition(new Vec2(0,0));
        }
        
        {
            for (int i = 0; i < 11; i++) {
                Body money = new Money(this);
                money.setPosition(new Vec2(i*2-10, 10));
                money.addCollisionListener(new Pickup(caveman,GD, 1));
            }
        }
    }
    //Adds the main character to the game
    public Caveman getActor() {
        return caveman;
    }
}


