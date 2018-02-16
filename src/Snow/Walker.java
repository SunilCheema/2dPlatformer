package Snow;

import city.cs.engine.*;
import org.jbox2d.common.Vec2;


public class Walker implements StepListener {
    private DynamicBody body;
    private float speed;
    
    Walker(DynamicBody body, float speed) {
        this.body = body;
        this.speed = speed;
    }
    
    @Override
    public void preStep(StepEvent e) {
        Vec2 v = body.getLinearVelocity();
        body.setLinearVelocity(new Vec2(speed, v.y));
    }
    
    @Override
    public void postStep(StepEvent e) {
    }
}
