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
        IOBox();
        LabelFrame();
        TextFieldFrame();
        ButtonFrame();
        CheckBoxFrame();
        RadioButtonFrame();
        ComboBoxFrame();
        ListFrame();
        MultipleSelectionFrame();
        MouseTrackerFrame();
        MouseDetailsFrame();
        Paint();
        KeyDemoFrame();
        FlowLayoutFrame();
        BorderLayoutFrame();
        GridLayoutFrame();
        PanelFrame();
        TextAreaFrame();
    }
    
    public static void IOBox()
    {
        IOBox box = new IOBox();
        box.BoxExample();
    }
    
    public static void LabelFrame()
    {
        LabelFrame labelFrame = new LabelFrame();
        labelFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        labelFrame.setSize(350, 300);
        labelFrame.setVisible(true);
    }
    
    public static void TextFieldFrame()
    {
        TextFieldFrame texFrame = new TextFieldFrame();
        texFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        texFrame.setSize(260, 180);
        texFrame.setVisible(true);
    }
    
    public static void ButtonFrame()
    {
        ButtonFrame buttFrame = new ButtonFrame();
        buttFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        buttFrame.setSize(260, 180);
        buttFrame.setVisible(true);
    }
    
    public static void CheckBoxFrame()
    {
        CheckBoxFrame cBFrame = new CheckBoxFrame();
        cBFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cBFrame.setSize(260, 180);
        cBFrame.setVisible(true);
    }
    
    public static void RadioButtonFrame()
    {
        RadioButtonFrame rBFrame = new RadioButtonFrame();
        rBFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        rBFrame.setSize(300, 180);
        rBFrame.setVisible(true);
    }
    
    public static void ComboBoxFrame()
    {
        ComboBoxFrame coBFrame = new ComboBoxFrame();
        coBFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        coBFrame.setSize(260, 180);
        coBFrame.setVisible(true);
    }
    
    public static void ListFrame()
    {
        ListFrame lFrame = new ListFrame();
        lFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        lFrame.setSize(260, 180);
        lFrame.setVisible(true);
    }
    
    public static void MultipleSelectionFrame()
    {
        MultipleSelectionFrame mSFrame = new MultipleSelectionFrame();
        mSFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mSFrame.setSize(350, 180);
        mSFrame.setVisible(true);
    }
    
    public static void MouseTrackerFrame()
    {
        MouseTrackerFrame mTFrame = new MouseTrackerFrame();
        mTFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mTFrame.setSize(260, 180);
        mTFrame.setVisible(true);
    }
    
    public static void MouseDetailsFrame()
    {
        MouseDetailsFrame mDFrame = new MouseDetailsFrame();
        mDFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mDFrame.setSize(260, 180);
        mDFrame.setVisible(true);
    }
    
    public static void Paint()
    {
        JFrame application = new JFrame("A simple paint program");
        PaintPanel pPanel = new PaintPanel();
        application.add(pPanel, BorderLayout.CENTER);
        application.add(new JLabel("Drag the mouse to draw"), BorderLayout.SOUTH);
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.setSize(400, 200);
        application.setVisible(true);
    }
    
    public static void KeyDemoFrame()
    {
        KeyDemoFrame kDFrame = new KeyDemoFrame();
        kDFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        kDFrame.setSize(350, 100);
        kDFrame.setVisible(true);
    }
    
    public static void FlowLayoutFrame()
    {
        FlowLayoutFrame fLFrame = new FlowLayoutFrame();
        fLFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fLFrame.setSize(300, 75);
        fLFrame.setVisible(true);
    }
    
    public static void BorderLayoutFrame()
    {
        BorderLayoutFrame bLFrame = new BorderLayoutFrame();
        bLFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        bLFrame.setSize(300, 200);
        bLFrame.setVisible(true);
    }
    
    public static void GridLayoutFrame()
    {
        GridLayoutFrame gLFrame = new GridLayoutFrame();
        gLFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gLFrame.setSize(300, 200);
        gLFrame.setVisible(true);
    }
    
    public static void PanelFrame()
    {
        PanelFrame pFrame = new PanelFrame();
        pFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pFrame.setSize(450, 200);
        pFrame.setVisible(true);
    }
    
    public static void TextAreaFrame()
    {
        TextAreaFrame tAFrame = new TextAreaFrame();
        tAFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tAFrame.setSize(425, 200);
        tAFrame.setVisible(true);
    }
    
}
