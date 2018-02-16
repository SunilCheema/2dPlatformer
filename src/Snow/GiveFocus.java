package Snow;

import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GiveFocus extends MouseAdapter {
    private Component target;
    
    //give taget
    public GiveFocus(Component target) {
        this.target = target;
    }
    
    
    @Override
    public void mouseEntered(MouseEvent e) {
        target.requestFocus();
    }
}
