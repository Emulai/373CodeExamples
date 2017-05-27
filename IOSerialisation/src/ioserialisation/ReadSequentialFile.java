/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ioserialisation;
import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
/**
 *
 * @author jaknd
 */
public class ReadSequentialFile {
    private ObjectInputStream input;
    
    public ReadSequentialFile()
    {
        
    }
    
    public void openFile()
    {
        try
        {
            input = new ObjectInputStream(
                Files.newInputStream(Paths.get("clients.ser")));
        }
        catch(IOException ioException)
        {
            System.err.println("Error opening file.");
            System.exit(1);
        }
    }
    
    public void readRecords()
    {
        System.out.printf("%-10s%-12s%-12s%10s%n", "Account", "First Name",
            "Last Name", "Balance");
        
        try
        {
            while (true)
            {
                Account record = (Account) input.readObject();
                
                System.out.printf("%-10d%-12s%-12s%10.2f%n", 
                        record.getAccount(), record.getFirstName(),
                        record.getLastName(), record.getBalance());
            }
        }
        catch (EOFException endOfFileException)
        {
            System.out.printf("%nNo more records%n");
        }
        catch (ClassNotFoundException classNotFoundException)
        {
            System.err.println(classNotFoundException);
        }
        catch (IOException ioException)
        {
            System.err.println("Error reading from file. Terminating...");
        }
    }
    
    public void closeFile()
    {
        try
        {
            if (input != null)
                input.close();
        }
        catch (IOException ioException)
        {
            System.err.println("Error closing file. Terminating...");
            System.exit(1);
        }
    }
}
