/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Snow;

import city.cs.engine.BoxShape;
import city.cs.engine.Shape;
import city.cs.engine.StaticBody;
import city.cs.engine.StepEvent;
import city.cs.engine.StepListener;
import city.cs.engine.World;
import org.jbox2d.common.Vec2;
/**
 *
 * @author Sunil Cheema
 */
public class PlatformMove extends StaticBody implements StepListener{
    
    public static final Shape platform = new BoxShape(0.5f, 2);
    
    
    
            

    public PlatformMove(World world) {
        super(world, platform);
       this.setPosition(new Vec2(19, -6));
       
    }

    @Override
    public void preStep(StepEvent se) {
        this.move(new Vec2(0.2f,0));
    }

    @Override
    public void postStep(StepEvent se) {
   
        
    }

    
}