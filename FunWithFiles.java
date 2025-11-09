/**
 * Program to copy one file into another, using command line arguments
 *
 * @author Lokesh Narasimhan
 * @author none
 * @version 11/09/2025
 *
 */

// import all of the necessary libraries 
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FunWithFiles {
   
   /**
    * Displays the file given by fname to the screen
    * 
    * @param fname file to be displayed
    */
   public static void displayFile(String fname){

        try (BufferedReader reader = new BufferedReader(new FileReader("jabberwock.txt"))){

            String line;
            while ((line = reader.readLine()) != null){
                System.out.println(line);
            }
        }
        catch (IOException e){
            System.out.println("ERROR - File " + fname + " not found!");
        }
   }
   

    public static void main(String[] args) {
      //TODO: Prompt the user for a filename        

    }

}