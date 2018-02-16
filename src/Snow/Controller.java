package Snow;

import city.cs.engine.*;
import org.jbox2d.common.Vec2;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.IOException;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
//to move the body around
public class Controller extends KeyAdapter {

    private static final float JUMPING_SPEED = 15;
    private static final float WALKING_SPEED = 12;
    private DynamicBody body;
    private World world;
    private Walker walkLeft;
    private Walker walkRight;

    public Controller(DynamicBody body) {
        this.body = body;
        this.world = body.getWorld();
        this.walkLeft = new Walker(body, -WALKING_SPEED);
        this.walkRight = new Walker(body, WALKING_SPEED);
    }

    //make the character jump and walk 
    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();
        if (code == KeyEvent.VK_Q) { // Q = quit
            System.exit(0);
        } else if (code == KeyEvent.VK_SPACE) { // SPACE = jump
            Vec2 v = body.getLinearVelocity();
            // only jump if body is not already jumping
            if (Math.abs(v.y) < 0.01f) {
                body.setLinearVelocity(new Vec2(v.x, JUMPING_SPEED));
            }

            try {
                Sound getstar = new Sound("data/jump.wav");
                getstar.play();

            } catch (UnsupportedAudioFileException ex) {
                ex.printStackTrace();
            } catch (IOException ex) {
                ex.printStackTrace();
            } catch (LineUnavailableException ex) {
                ex.printStackTrace();
            }

        } else if (code == KeyEvent.VK_LEFT) {
            // LEFT ARROW = walk left
            world.addStepListener(walkLeft);
        } else if (code == KeyEvent.VK_RIGHT) {
            // RIGHT ARROW = walk right
            world.addStepListener(walkRight);
        }
    }

    //stops walking
    @Override
    public void keyReleased(KeyEvent e) {
        int code = e.getKeyCode();
        if (code == KeyEvent.VK_LEFT) {
            world.removeStepListener(walkLeft);
        } else if (code == KeyEvent.VK_RIGHT) {
            world.removeStepListener(walkRight);
        }
    }
}
