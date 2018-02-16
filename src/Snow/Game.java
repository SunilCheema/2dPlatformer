package Snow;

import city.cs.engine.*;
import java.awt.event.FocusEvent;
import org.jbox2d.common.Vec2;
import java.awt.BorderLayout;
import java.io.IOException;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JButton;

import javax.swing.JFrame;


public class Game {

   
    public GameWorld world;
    private UserView view;
    private JFrame frame;
    private GameWorld1 world1;
    private GameWorld2 world2;
    
    private Menu menu;
    private SoundClip Sound1;
    
    public static int currentLevel = 1;
   

    public Game() {

        
        world = new GameWorld(this);

        
        
        view = new ScoreBoard(world,world.getActor(), 1000, 587);

         //view = new ScoreBoard(world,world.getActor(), 900, 500);
        
        
        frame = new JFrame("Cave");
        
        menu = new Menu(this);

        // closes the application when the game window is closed
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationByPlatform(true);
        frame.setSize(1000, 700);
        // display the world in the window
        frame.add(menu);        
        //view.setGridResolution(1);
        

        view.add(new ControlPanel(this, world));

        // doesnt allow resizing
        frame.setResizable(false);
        // size the  window
        //frame.pack();
        // window visible
        frame.setVisible(true);
        // get keyboard focus
        frame.requestFocus();
        // give keyboard focus to the frame 
        view.addMouseListener(new GiveFocus(frame));
        
        frame.addKeyListener(new Controller(world.getActor()));
        
        // view track the character
        world.addStepListener(new Tracker(view, world.getActor()));
        

        // comment if degug is debugging view is needed
        //JFrame debugView = new DebugViewer(world, 500, 500);

      
        world.start();
   
        try {
            Sound1 = new SoundClip("data/FreedomDance.wav");
        }
        catch (Exception e)
        {
            System.out.println("invlaid");
        }
        Sound1.loop();
    }
    
    
    public void setView() {
        frame.remove (menu);
        frame.add(view);
        frame.pack();
        frame.requestFocusInWindow();
        frame.repaint();
        world.start();
    }
    
    
    
    
    
public World getWorld() {
        return world;
}

public void changeWorld(){
    currentLevel = 2;
//    System.err.println("collsision");
    world.setPaused(true);
    frame.remove(view);
    
    world1 = new GameWorld1(this);
   
    
    view = new ScoreBoard(world1, world1.getActor(),1000, 587);
    frame.add(view);
    frame.pack();
    view.addMouseListener(new DropBomb(view,world1.getPlatform()));
    frame.addKeyListener(new Controller(world1.getActor()));
        
        // view track the character
        world1.addStepListener(new Tracker(view, world1.getActor()));
                view.add(new ControlPanel(this, world));


        
    world1.start();
}
//allow the restert button to function
public void restart() {
        
    if (currentLevel == 1) {
        
    } else if (currentLevel == 2) {
        changeWorld();
    }
}

public void restartWorld() {
    world.setPaused(true);
    frame.remove(view);
    
    world2 = new GameWorld2(this);
   
    
    view = new ScoreBoard(world2, world2.getActor(),1000, 587);
    frame.add(view);
    frame.pack();
    view.addMouseListener(new DropBomb(view,world1.getPlatform()));
    frame.addKeyListener(new Controller(world1.getActor()));
        
        // view track the character
        world1.addStepListener(new Tracker(view, world2.getActor()));

        
    world2.start();
}
  //Allows the world to change after the objectives have been completed
public void changeWorld1(){
    world.setPaused(true);
    frame.remove(view);
    
    world2 = new GameWorld2(this);
   
    
    view = new ScoreBoard(world2, world2.getActor(),1000, 587);
    frame.add(view);
    frame.pack();
    view.addMouseListener(new DropBomb(view,world2.getPlatform()));
    frame.addKeyListener(new Controller(world2.getActor()));
        
        // view track the character
        world2.addStepListener(new Tracker(view, world2.getActor()));

        
    world2.start();
}
//implements the game in the main class
public static void main(String[] args) {
        new Game();
    }
}
