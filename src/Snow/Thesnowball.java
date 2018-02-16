package Snow;

import city.cs.engine.*;


public class Thesnowball extends DynamicBody {
    private static final Shape shape = new PolygonShape(
        -0.21f,0.089f*2, 0.272f*2,0.106f*2, 0.176f*2,-0.488f*2, -0.052f*2,-0.494f*2);
     
    private static final Shape shape2 = new PolygonShape(0.268f,0.116f*2, -0.195f*2,0.099f*2, -0.132f*2,0.482f*2, 0.14f*2,0.479f*2);

    private int count;
    
    public Thesnowball (World world) {
        super(world);
        SolidFixture fixture1 = new SolidFixture(this, shape, 5);
        SolidFixture fixture2 = new SolidFixture(this, shape2, 100);
        fixture1.setFriction(1.0f);
        fixture2.setFriction(1.0f);     
        setImage (new BodyImage("data/snowball.png", 2));
        setFixedRotation(true);
    }

}