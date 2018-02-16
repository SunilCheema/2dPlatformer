package Snow;

import city.cs.engine.BodyImage;
import city.cs.engine.BoxShape;
import city.cs.engine.CollisionEvent;
import city.cs.engine.CollisionListener;
import city.cs.engine.DynamicBody;
import city.cs.engine.Shape;
import city.cs.engine.World;


/**
 *
 * @author Sunil Cheema
 */
public class IceBerg extends DynamicBody implements CollisionListener{
    
    private static final Shape shape = new BoxShape(1f, 1f);
    
    public IceBerg(World world) {
        super(world, shape);
        //SolidFixture fixture = new SolidFixture(this, shape, 5);
        setImage (new BodyImage("data/icespike.png",3f));
        setFixedRotation(true);
        this.addCollisionListener(this);
    }
    
    @Override
    public void collide(CollisionEvent e) {
//        if (e.getOtherBody() == platform) {       
//            platform.destroy();
//            System.out.println("Collision");
//        }
    }
}