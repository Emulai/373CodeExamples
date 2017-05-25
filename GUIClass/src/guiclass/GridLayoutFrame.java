/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiclass;
import java.awt.GridLayout;
import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
/**
 *
 * @author jaknd
 */
public class GridLayoutFrame extends JFrame implements ActionListener {
    private final JButton[] buttons;
    private static final String[] names = 
        {"one", "two", "three", "four", "five", "six"};
    private boolean toggle = true;
    private final Container container;
    private final GridLayout gridLayout1;
    private final GridLayout gridLayout2;
    
    GridLayoutFrame()
    {
        super("GridLayout Demo");
        gridLayout1 = new GridLayout(2, 3, 5, 5);
        gridLayout2 = new GridLayout(3, 2);
        container = getContentPane();
        setLayout(gridLayout1);
        buttons = new JButton[names.length];
        
        for (int count = 0; count < names.length; count++)
        {
            buttons[count] = new JButton(names[count]);
            buttons[count].addActionListener(this);
            add(buttons[count]);
        }
    }
    
    @Override
    public void actionPerformed(ActionEvent event)
    {
        if (toggle)
            container.setLayout(gridLayout2);
        else
            container.setLayout(gridLayout1);
        
        toggle = !toggle;
        container.validate();
    }
    
}
