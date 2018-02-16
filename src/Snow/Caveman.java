package Snow;

import city.cs.engine.*;
import org.jbox2d.common.Vec2;
//to make the character and the set the dimensions used to interact with the rest of the world
public class Caveman extends DynamicBody {
    private static final Shape shape = new PolygonShape(-0.49f,3.04f, -0.5f,2.12f, 0.46f,2.12f, 0.38f,3.05f);
    private static final Shape shape2 = new PolygonShape(-1.14f,2.25f, -1.44f,-2.06f, 1.45f,-2.06f, 1.04f,2.27f);

    private int count;
    
    /**Seperates the main character into different fixtures which allow different parts of
    *of the character to interact with the world differently 
    */
    
    
    
    public Caveman(World world) {
        super(world);
        SolidFixture fixture1 = new SolidFixture(this, shape, 5);
        SolidFixture fixture2 = new SolidFixture(this, shape2, 20);
        fixture1.setFriction(1.0f);
        fixture2.setFriction(1.0f);
        this.setName("Caveman");
        setImage (new BodyImage("data/chief.png", 7));
        setFixedRotation(true);
        count = 0;
    }
    //gets the number of coins collected
    public int getCount() {
        return count;
    }
    // adds one to the count
    public void addOne() {
        count++;
        System.out.println("count = " + count);
    }
    //takes away points after a spike is hit
    public void hitSpike() {
        count = count - 5;
    }
}
