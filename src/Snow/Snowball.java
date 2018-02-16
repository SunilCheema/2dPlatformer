package Snow;

import city.cs.engine.*;
import org.jbox2d.common.Vec2;


 public class Snowball extends DynamicBody{
    private static final float headWidth = 0.3f;
    private static final float headHeight = 0.3f;
    private static final float handleWidth = 0.3f;
    private static final float handleHeight = 0.3f;
    
    
    private static final BodyImage image = new BodyImage("data/snowball.png");
    
    public Snowball(World world, float height){
        super(world);
        float headWidth2 = headWidth * height / 2;
        float headHeight2 = headHeight * height / 2;
        float handleWidth2 = handleWidth * height / 2;
        float handleHeight2 = handleHeight * height / 2;
        Shape headShape = new BoxShape(headWidth2, headHeight2,
                new Vec2(0, handleHeight2));
        SolidFixture body = new SolidFixture(this, headShape, 20);
        Shape handleShape = new BoxShape(handleWidth2, handleHeight2,
                new Vec2(0, -headHeight2));
        SolidFixture pin = new SolidFixture(this, handleShape, 1);
        setImage(image);
    }
}
