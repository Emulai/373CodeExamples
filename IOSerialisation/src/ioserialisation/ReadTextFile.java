/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ioserialisation;
import java.io.IOException;
import java.lang.IllegalStateException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;
/**
 *
 * @author jaknd
 */
public class ReadTextFile {
    private Scanner input;
    
    public ReadTextFile()
    {
        
    }
    
    public void openFile()
    {
        try
        {
            input = new Scanner(Paths.get("clients.txt"));
        }
        catch(IOException ioException)
        {
            System.err.println("Error opening file. Terminating...");
            System.exit(1);
        }
    }
    
    public void readRecords()
    {
        System.out.printf("%-10s%-12s%-12s%10s%n", "Account", "First Name",
                "Last Name", "Balance");
        
        try
        {
            while(input.hasNext())
            {
                System.out.printf("%-10d%-12s%-12s%10.2f%n", input.nextInt(),
                        input.next(), input.next(), input.nextDouble());
            }
        }
        catch(NoSuchElementException elementException)
        {
            System.err.println("File improperly formed. Terminating...");
        }
        catch(IllegalStateException stateException)
        {
            System.err.println("Error reading from file. Terminating...");
        }
    }
    
    public void closeFile()
    {
        if(input != null)
            input.close();
    }
}
