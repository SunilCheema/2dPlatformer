package Snow;

import city.cs.engine.*;
import org.jbox2d.common.Vec2;

import java.awt.Color;

/**
 *
 * @author Sunil Cheema
 */
public class Money extends DynamicBody {
    private static final Shape shape = new CircleShape(1f);
    
    public Money(World world) {
        super(world, shape);
        SolidFixture fixture = new SolidFixture(this, shape, 5);
        setImage (new BodyImage("data/money.png",3f));
        setFixedRotation(true);
        
    }
}
