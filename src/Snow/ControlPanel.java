/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Snow;

import static Snow.Game.currentLevel;
import java.awt.Frame;

/**
 *
 * @author nigelfernandes
 */
public class ControlPanel extends javax.swing.JPanel {

    /**
     * Creates new form ControlPanel
     */
    private Game game;
    
    private GameWorld world;

//    Frame frame;
    public ControlPanel(Game game, GameWorld world) {
        this.world = world;
        this.game = game;
//        this.frame = fraxme;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PAUSE = new javax.swing.JButton();
        Exit = new javax.swing.JButton();
        Restard = new javax.swing.JButton();
        Resume = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setOpaque(false);

        PAUSE.setText("Pause ");
        PAUSE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PAUSEActionPerformed(evt);
            }
        });

        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });

        Restard.setText("Restart");
        Restard.setFocusable(false);
        Restard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RestardActionPerformed(evt);
            }
        });

        Resume.setText("Resume");
        Resume.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResumeActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Level 1:  collect 10 coins");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Level 2: drop a snowball on the platform above the penguin by clicking and collect the penguin ");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Level 3: Collect all coins");

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .add(0, 0, Short.MAX_VALUE)
                .add(Resume)
                .add(18, 18, 18)
                .add(Exit)
                .add(18, 18, 18)
                .add(PAUSE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(Restard)
                .add(170, 170, 170))
            .add(layout.createSequentialGroup()
                .add(213, 213, 213)
                .add(jLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 252, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                        .add(jLabel2)
                        .add(122, 122, 122))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                        .add(jLabel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 394, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(109, 109, 109))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel1)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jLabel2)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(jLabel3)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(Resume)
                    .add(Exit)
                    .add(PAUSE)
                    .add(Restard))
                .add(24, 24, 24))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void PAUSEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PAUSEActionPerformed
        // TODO add your handling code here:
       // world.getWorld().setPaused(true);
//        if (world.getWorld().isPaused()){
//            world.getWorld().setPaused(false);
//            
//        
//        }
//        else {
//        world.getWorld().setPaused(true);
//        }
        game.world.setPaused(true);
    }//GEN-LAST:event_PAUSEActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_ExitActionPerformed

    private void RestardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RestardActionPerformed
        // TODO add your handling code here:
        //game.restart();
    if (currentLevel == 1) {
        
    } else if (currentLevel == 2) {
        game.changeWorld();
    }
    }//GEN-LAST:event_RestardActionPerformed

    private void ResumeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResumeActionPerformed
        // TODO add your handling code here:
        game.world.setPaused(false);
    }//GEN-LAST:event_ResumeActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Exit;
    private javax.swing.JButton PAUSE;
    private javax.swing.JButton Restard;
    private javax.swing.JButton Resume;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
