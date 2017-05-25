/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiclass;
import java.awt.FlowLayout;
import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
/**
 *
 * @author jaknd
 */
public class FlowLayoutFrame extends JFrame {
    private final JButton leftJButton;
    private final JButton centerJButton;
    private final JButton rightJButton;
    private final FlowLayout layout;
    private final Container container;
    
    public FlowLayoutFrame()
    {
        super("FlowLayout Demo");
        
        layout = new FlowLayout();
        container = getContentPane();
        setLayout(layout);
        
        leftJButton = new JButton("Left");
        add(leftJButton);
        leftJButton.addActionListener(
            new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent event)
                {
                    layout.setAlignment(FlowLayout.LEFT);
                    layout.layoutContainer(container);
                }
            }
        );
        
        centerJButton = new JButton("Center");
        add(centerJButton);
        centerJButton.addActionListener(
            new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent event)
                {
                    layout.setAlignment(FlowLayout.CENTER);
                    layout.layoutContainer(container);
                }
            }
        );
        
        rightJButton = new JButton("Right");
        add(rightJButton);
        rightJButton.addActionListener(
            new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent event)
                {
                    layout.setAlignment(FlowLayout.RIGHT);
                    layout.layoutContainer(container);
                }
            }
        );
    }
    
}
