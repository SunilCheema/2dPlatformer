/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Snow;

import city.cs.engine.BodyImage;
import city.cs.engine.BoxShape;
import city.cs.engine.DynamicBody;
import city.cs.engine.Shape;
import city.cs.engine.SolidFixture;
import city.cs.engine.World;
import java.awt.Color;

/**
 *
 * @author Sunil Cheema
 */

//
public class SlidingPlatform extends DynamicBody {
    
    private static final Shape shape = new BoxShape(0.1f,0.1f);
 
    public SlidingPlatform(World world){  
            super(world,shape);
            SolidFixture body = new SolidFixture(this, shape);
            body.setRestitution(1f);
            body.setFriction(0.2f);
            setImage(new BodyImage("data/mountainice.png",2f));
            
            
}     
    

}