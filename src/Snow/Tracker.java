package Snow;

import city.cs.engine.*;
import org.jbox2d.common.Vec2;


public class Tracker implements StepListener {
   
    private WorldView view;

   
    private Body body;

    public Tracker(WorldView view, Body body) {
        this.view = view;
        this.body = body;
    }

    
    public void preStep(StepEvent e) {
    }

    
    public void postStep(StepEvent e) {
        view.setCentre(new Vec2(body.getPosition()));
    }
    
}
