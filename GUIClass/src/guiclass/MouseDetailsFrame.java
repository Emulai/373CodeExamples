/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiclass;
import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
/**
 *
 * @author jaknd
 */
public class MouseDetailsFrame extends JFrame {
    private String details;
    private final JLabel statusBar;
    
    public MouseDetailsFrame()
    {
        super("Mouse clicks and buttons");
        
        statusBar = new JLabel("Click the mouse");
        add(statusBar, BorderLayout.SOUTH);
        addMouseListener(new MouseClickHandler());
    }
    
    private class MouseClickHandler extends MouseAdapter
    {
        @Override
        public void mouseClicked(MouseEvent event)
        {
            int xPos = event.getX();
            int yPos = event.getY();
            
            details = String.format("Clicked %d times", event.getClickCount());
            
            if (event.isMetaDown())
                details += " with right mouse button";
            else if (event.isAltDown())
                details += " with center mouse button";
            else
                details += " with left mouse button";
            
            statusBar.setText(details);
        }
    }
    
}
