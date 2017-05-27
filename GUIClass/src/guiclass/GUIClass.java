/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiclass;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
/**
 *
 * @author jaknd
 */
public class GUIClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Fig12_2();
        //Fig12_6();
        //Fig12_9();
        //Fig12_15();
        //Fig12_17();
        //Fig12_19();
        //Fig12_21();
        //Fig12_23();
        //Fig12_25();
        //Fig12_28();
        //Fig12_31();
        //Fig12_34();
        //Fig12_36();
        //Fig12_39();
        //Fig12_41();
        //Fig12_43();
        //Fig12_45();
        //Fig12_47();
        Fig22_5();
    }
    
    public static void Fig12_2()
    {
        IOBox box = new IOBox();
        box.BoxExample();
    }
    
    public static void Fig12_6()
    {
        LabelFrame labelFrame = new LabelFrame();
        labelFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        labelFrame.setSize(350, 300);
        labelFrame.setVisible(true);
    }
    
    public static void Fig12_9()
    {
        TextFieldFrame texFrame = new TextFieldFrame();
        texFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        texFrame.setSize(260, 180);
        texFrame.setVisible(true);
    }
    
    public static void Fig12_15()
    {
        ButtonFrame buttFrame = new ButtonFrame();
        buttFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        buttFrame.setSize(260, 180);
        buttFrame.setVisible(true);
    }
    
    public static void Fig12_17()
    {
        CheckBoxFrame cBFrame = new CheckBoxFrame();
        cBFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cBFrame.setSize(260, 180);
        cBFrame.setVisible(true);
    }
    
    public static void Fig12_19()
    {
        RadioButtonFrame rBFrame = new RadioButtonFrame();
        rBFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        rBFrame.setSize(300, 180);
        rBFrame.setVisible(true);
    }
    
    public static void Fig12_21()
    {
        ComboBoxFrame coBFrame = new ComboBoxFrame();
        coBFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        coBFrame.setSize(260, 180);
        coBFrame.setVisible(true);
    }
    
    public static void Fig12_23()
    {
        ListFrame lFrame = new ListFrame();
        lFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        lFrame.setSize(260, 180);
        lFrame.setVisible(true);
    }
    
    public static void Fig12_25()
    {
        MultipleSelectionFrame mSFrame = new MultipleSelectionFrame();
        mSFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mSFrame.setSize(350, 180);
        mSFrame.setVisible(true);
    }
    
    public static void Fig12_28()
    {
        MouseTrackerFrame mTFrame = new MouseTrackerFrame();
        mTFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mTFrame.setSize(260, 180);
        mTFrame.setVisible(true);
    }
    
    public static void Fig12_31()
    {
        MouseDetailsFrame mDFrame = new MouseDetailsFrame();
        mDFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mDFrame.setSize(260, 180);
        mDFrame.setVisible(true);
    }
    
    public static void Fig12_34()
    {
        JFrame application = new JFrame("A simple paint program");
        PaintPanel pPanel = new PaintPanel();
        application.add(pPanel, BorderLayout.CENTER);
        application.add(new JLabel("Drag the mouse to draw"), BorderLayout.SOUTH);
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.setSize(400, 200);
        application.setVisible(true);
    }
    
    public static void Fig12_36()
    {
        KeyDemoFrame kDFrame = new KeyDemoFrame();
        kDFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        kDFrame.setSize(350, 100);
        kDFrame.setVisible(true);
    }
    
    public static void Fig12_39()
    {
        FlowLayoutFrame fLFrame = new FlowLayoutFrame();
        fLFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fLFrame.setSize(300, 75);
        fLFrame.setVisible(true);
    }
    
    public static void Fig12_41()
    {
        BorderLayoutFrame bLFrame = new BorderLayoutFrame();
        bLFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        bLFrame.setSize(300, 200);
        bLFrame.setVisible(true);
    }
    
    public static void Fig12_43()
    {
        GridLayoutFrame gLFrame = new GridLayoutFrame();
        gLFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gLFrame.setSize(300, 200);
        gLFrame.setVisible(true);
    }
    
    public static void Fig12_45()
    {
        PanelFrame pFrame = new PanelFrame();
        pFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pFrame.setSize(450, 200);
        pFrame.setVisible(true);
    }
    
    public static void Fig12_47()
    {
        TextAreaFrame tAFrame = new TextAreaFrame();
        tAFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tAFrame.setSize(425, 200);
        tAFrame.setVisible(true);
    }
    
    public static void Fig22_5()
    {
        MenuFrame menuFrame = new MenuFrame();
        menuFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        menuFrame.setSize(500, 200);
        menuFrame.setVisible(true);
    }
    
}
