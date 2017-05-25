/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiclass;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.Icon;
import javax.swing.ImageIcon;
/**
 *
 * @author jaknd
 */
public class LabelFrame extends JFrame {
    private final JLabel label1;
    private final JLabel label2;
    private final JLabel label3;
    
    public LabelFrame()
    {
        super("Testing JLabel");
        setLayout(new FlowLayout());
        
        label1 = new JLabel("Label with text");
        label1.setToolTipText("This is label1");
        add(label1);
        
        Icon ship = new ImageIcon(getClass().getResource("ship.png"));
        label2 = new JLabel("Label with text and icon", ship, SwingConstants.LEFT);
        label2.setToolTipText("This is label2");
        add(label2);
        
        label3 = new JLabel();
        label3.setText("Label with icon and text at bottom");
        label3.setIcon(ship);
        label3.setHorizontalTextPosition(SwingConstants.CENTER);
        label3.setVerticalTextPosition(SwingConstants.BOTTOM);
        label3.setToolTipText("This is label3");
        add(label3);
    }
}
