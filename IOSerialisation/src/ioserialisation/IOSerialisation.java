/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ioserialisation;
import java.io.IOException;
import javax.swing.JFrame;
/**
 *
 * @author jaknd
 */
public class IOSerialisation {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        //Fig15_2();
        //Fig15_3();
        //Fig15_6();
        //Fig15_8();
        //Fig15_10();
        //Fig15_11();
        //Fig15_12();
    } 
    
    public static void Fig15_2() throws IOException
    {
        FileAttributes fAtt = new FileAttributes();
        fAtt.TestAttributes();
    }
    
    public static void Fig15_3()
    {
        CreateTextFile cTFile = new CreateTextFile();
        cTFile.openFile();
        cTFile.addRecords();
        cTFile.closeFile();
    }
    
    public static void Fig15_6()
    {
        ReadTextFile rTFile = new ReadTextFile();
        rTFile.openFile();
        rTFile.readRecords();
        rTFile.closeFile();
    }
    
    public static void Fig15_8()
    {
        CreditInquiry cInquiry = new CreditInquiry();
        cInquiry.Menu();
    }
    
    public static void Fig15_10()
    {
        CreateSequentialFile cSFile = new CreateSequentialFile();
        cSFile.openFile();
        cSFile.addRecords();
        cSFile.closeFile();
    }
    
    public static void Fig15_11()
    {
        ReadSequentialFile rSFile = new ReadSequentialFile();
        rSFile.openFile();
        rSFile.readRecords();
        rSFile.closeFile();
    }
    
    public static void Fig15_12() throws IOException
    {
        JFileChooserDemo jFile = new JFileChooserDemo();
        jFile.setSize(400, 400);
        jFile.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFile.setVisible(true);
    }
}
