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

        // try-block to read the file in using thr BufferedReader object
        try (BufferedReader reader = new BufferedReader(new FileReader(fname))){

            String line;
            // while loop to read the file's contents until there are none
            while ((line = reader.readLine()) != null){
                System.out.println(line); // print out the line to the console
            }
        }
        catch (IOException e){
            System.out.println("ERROR - File " + fname + " not found!"); // display this message if the file is not found
        }

   }
   

    public static void main(String[] args) {
      
        Scanner console = new Scanner(System.in); // creates a new Scanner object 'console'       

        System.out.print("Enter a filename: ");
        String inputFile = console.nextLine(); // reads in the input file's name from the user's keyboard

        displayFile(inputFile);
        console.close();
    }

}