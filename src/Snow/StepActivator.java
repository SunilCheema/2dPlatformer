/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Snow;

import city.cs.engine.StepEvent;
import city.cs.engine.StepListener;
import org.jbox2d.common.Vec2;

/**
 *
 * @author Sunil Cheema
 */
public class StepActivator implements StepListener {

    PlatformMove platform;
    boolean platformCollide = true;

    @Override
    public void preStep(StepEvent se) {

    }

    public StepActivator(PlatformMove platform) {
        this.platform = platform;

    }

    @Override
    public void postStep(StepEvent se) {
 

        if (platform.getPosition().x >= 24) {

            platformCollide = false;

        }
        
        else if(platform.getPosition().x<=13.5f)
        {
        
            platformCollide = true;
        
        }
        
        if (platformCollide == true){
            
        platform.move(new Vec2(0.03f, 0f));
        }
        else 
        {
        platform.move(new Vec2(-0.03f, 0f));
        }

    }

}