package Snow;

import city.cs.engine.*;

import java.awt.Color;
import org.jbox2d.common.Vec2;

/**
 *
 * @author Sunil Cheema
 */
public class Platform extends StaticBody {
    
    private static final Shape shape = new BoxShape(4.5f,0.4f);
    
    public Platform(World world){  
            super(world, shape);
            setFillColor(Color.pink);
            
}     
    

}

