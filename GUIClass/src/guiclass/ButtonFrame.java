/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiclass;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
/**
 *
 * @author jaknd
 */
public class ButtonFrame extends JFrame {
    private final JButton plainJButton;
    private final JButton fancyJButton;
    
    public ButtonFrame()
    {
        super("Testing Buttons");
        setLayout(new FlowLayout());
        
        plainJButton = new JButton("Plain Button");
        add(plainJButton);
        
        Icon ship = new ImageIcon(getClass().getResource("ship.png"));
        Icon aaah = new ImageIcon(getClass().getResource("aaaaah.png"));
        fancyJButton = new JButton("Fancy Button", ship);
        fancyJButton.setRolloverIcon(aaah);
        add(fancyJButton);
        
        ButtonHandler handler = new ButtonHandler();
        plainJButton.addActionListener(handler);
        fancyJButton.addActionListener(handler);
    }
    
    private class ButtonHandler implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent event)
        {
            JOptionPane.showMessageDialog(ButtonFrame.this, String.format(
                "You pressed: %s", event.getActionCommand()));
        }
    }
    
}
