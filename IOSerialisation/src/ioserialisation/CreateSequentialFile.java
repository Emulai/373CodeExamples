/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ioserialisation;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;
/**
 *
 * @author jaknd
 */
public class CreateSequentialFile {
    private ObjectOutputStream output;
    
    public CreateSequentialFile()
    {
        
    }
    
    public void openFile()
    {
        try
        {
            output = new ObjectOutputStream(
                Files.newOutputStream(Paths.get("clients.ser")));
        }
        catch(IOException ioException)
        {
            System.err.println("Error opening file. Terminating...");
            System.exit(1);
        }
    }
    
    public void addRecords()
    {
        Scanner input = new Scanner(System.in);
        
        System.out.printf("%s%n%s%n? ",
                "Enter account number, first name, last name and balance",
                "Enter end-of-file indicator to end input.");
        
        while (input.hasNextInt())
        {
            try
            {
                Account record = new Account(input.nextInt(),
                    input.next(), input.next(), input.nextDouble());
                
                output.writeObject(record);
            }
            catch(NoSuchElementException elementException)
            {
                System.err.println("Invalid input. Please try again.");
                input.nextLine();
            }
            catch(IOException ioException)
            {
                System.err.println("Error writing to file. Terminating...");
                break;
            }
            
            System.out.print("?");
        }
    }
    
    public void closeFile()
    {
        try
        {
            if(output != null)
                output.close();
        }
        catch(IOException ioException)
        {
            System.err.println("Error closing file. Terminating...");
        }
    }
}
