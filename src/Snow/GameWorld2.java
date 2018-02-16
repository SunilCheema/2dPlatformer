/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Snow;
import city.cs.engine.*;
import java.awt.Color;
import org.jbox2d.common.Vec2;

/**
 *
 * @author SunilCheema
 */
public class GameWorld2 extends World {
    private SlidingPlatform sPlatform;
    private Caveman caveman;
    private Thesnowball grenade;
    private Platform platform;
    private PlatformMove PlatformMove;
    private IceBerg spike;
    
    
    
    public GameWorld2(Game AR){
        super();
       
         
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
             Body platform7 = new StaticBody (this, shape);
            platform7.setPosition(new Vec2(44f,8f));
            platform7.setFillColor(Color.blue);
             Body platform8 = new StaticBody (this, shape);
            platform8.setPosition(new Vec2(62f,8f));
            platform8.setFillColor(Color.blue);
            
        }
        
        {
            sPlatform = new SlidingPlatform(this);
            sPlatform.setPosition(new Vec2(44f,1f));
        }
         {
            sPlatform = new SlidingPlatform(this);
            sPlatform.setPosition(new Vec2(62f,1f));
        }
         
         {
            sPlatform = new SlidingPlatform(this);
            sPlatform.setPosition(new Vec2(44f,-4f));
        }
         {
            sPlatform = new SlidingPlatform(this);
            sPlatform.setPosition(new Vec2(62f,-4f));
        }
         
          {
            spike = new IceBerg(this);
            spike.setPosition(new Vec2(65f,-4f));
            spike.addCollisionListener(new KillPlayer(caveman));
            
        }
          {
            spike = new IceBerg(this);
            spike.setPosition(new Vec2(47f,-4f));
            spike.addCollisionListener(new KillPlayer(caveman));
            
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
        for (int i = 0; i < 45; i++) {
                Body money = new Money(this);
                money.setPosition(new Vec2(i*2-10, 10));
                money.addCollisionListener(new Pickup(caveman,AR, 2));}
        }
        
        
     
        
        {
            platform = new Platform(this);
            platform.setPosition(new Vec2(1,15f));
           
        }
        
           
      
        
      
        }
        
        { // code for the charcter
            caveman = new Caveman(this);
            caveman.setPosition(new Vec2(8, -10));
        }
        
        
           
           
                   
    
    //Adds he main character to the level
     
        public Caveman getActor() {
        return caveman;
    }
        public Body getPlatform()
        {
            return platform;
        }
}

