
package Snow;

import city.cs.engine.Body;
import city.cs.engine.BodyImage;
import city.cs.engine.BoxShape;
import city.cs.engine.Shape;
import city.cs.engine.StaticBody;
import city.cs.engine.World;
import java.awt.Color;
import org.jbox2d.common.Vec2;

/**
 *
 * @author SunilCheema
 */
public class GameWorld1 extends World {
    private Caveman caveman;
    private Thesnowball grenade;
    private Platform platform;
    private Game AR;
    private IceBerg spike;
  
    
    public GameWorld1(Game AR){
        super();
       
         
         // code for the charcter
            caveman = new Caveman(this);
            caveman.setPosition(new Vec2(8, -10));
        { // to make the foundation of the platform
            Shape shape = new BoxShape(150, 1f);
            Body ground = new StaticBody(this, shape);
            ground.setPosition(new Vec2(0, -11.5f));
            ground.setFillColor(Color.blue);
            
        }

        { // these are the platforms used, where the player is able to jump on it
            Shape shape = new BoxShape(4, 0.5f);
            Body platform1 = new StaticBody(this, shape);
            platform1.setPosition(new Vec2(-7, 4f));
            platform1.setFillColor(Color.blue);
            Body platform2 = new StaticBody(this, shape);
            platform2.setPosition(new Vec2(9, -2.5f));
            platform2.setFillColor(Color.blue);
            Body platform3 = new StaticBody(this, shape);
            platform3.setPosition(new Vec2(27,4f));
            platform3.setFillColor(Color.blue);
            
               
        }
       
       
        
        { // these are the platforms used, where the player is able to jump on it
            Shape shape = new BoxShape(6, 0.5f);
            Body platform1 = new StaticBody(this, shape);
            platform1.setPosition(new Vec2(44f, -2f));
            platform1.setFillColor(Color.blue);
            Body platform2 = new StaticBody(this, shape);
            platform2.setPosition(new Vec2(62f, -2f));
            platform2.setFillColor(Color.blue);
            
            
            Body platform6 = new StaticBody (this, shape);
            platform6.setPosition(new Vec2(20f,16f));
            platform6.setFillColor(Color.blue);
        }
        
        {
        Shape shape = new BoxShape(0.4f,2f);
        Body platform5 = new StaticBody(this, shape);
        platform5.setPosition(new Vec2(96f,-8f));
        platform5.setFillColor(Color.orange);
        }
        {
        Shape shape = new BoxShape(0.4f,2f);
        Body platform6 = new StaticBody(this, shape);
        platform6.setPosition(new Vec2(104f,-8f));
        platform6.setFillColor(Color.orange);
        }
        
        
        {
            platform = new Platform(this);
            platform.setPosition(new Vec2(100f,-6f));
            
            
        }
        {
            spike = new IceBerg(this);
            spike.setPosition(new Vec2(62f,-6f));
            spike.addCollisionListener(new KillPlayer(caveman));
            
        }
        {
            spike = new IceBerg(this);
            spike.setPosition(new Vec2(60f,-6f));
            spike.addCollisionListener(new KillPlayer(caveman));
            
        }
        {
            spike = new IceBerg(this);
            spike.setPosition(new Vec2(58f,-6f));
            spike.addCollisionListener(new KillPlayer(caveman));
            
        }
        {
            spike = new IceBerg(this);
            spike.setPosition(new Vec2(56f,-6f));
            spike.addCollisionListener(new KillPlayer(caveman));
            
        }
        {
            spike = new IceBerg(this);
            spike.setPosition(new Vec2(54f,-6f));
            spike.addCollisionListener(new KillPlayer(caveman));
            
        }
        {
            spike = new IceBerg(this);
            spike.setPosition(new Vec2(52f,-6f));
            spike.addCollisionListener(new KillPlayer(caveman));
            
        }
       
        
        
           
        
        
        {
        Shape shape = new BoxShape(4f,0.4f);
        Body key = new StaticBody(this, shape);
        key.setPosition(new Vec2(100f,-9f));
        key.setImage(new BodyImage("Data/thepenguin.png"));
        key.addCollisionListener(new PickupPenguin(caveman,AR));
        }
        
        {
        for (int i = 0; i < 25; i++) {
                Body money = new Money(this);
                money.setPosition(new Vec2(i*2-10, 10));
                money.addCollisionListener(new Pickup(caveman,AR, 2));}
        }
        
        
        }
    
    
     //Adds he main character to the level
        public Caveman getActor() {
        return caveman;
    }
        //Gtes the platform which can be destroyed by the snowball
        public Body getPlatform()
        {
            return platform;
        }
}

