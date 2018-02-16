/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Snow;


import city.cs.engine.SoundClip;
import java.io.IOException;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Sound extends SoundClip{
    private String filename;
    
    public Sound(String filename) throws UnsupportedAudioFileException, IOException, LineUnavailableException

    {
        super(filename);
        this.filename = filename;
    }

}