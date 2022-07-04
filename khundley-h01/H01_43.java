import java.io.*;
import java.util.Scanner;
/**
 * Class: H01_43
 * Author: Kenyon Hundley, khundley, khundley@asu.edu
 */
public class H01_43 {
    public static void main(String[] args) throws FileNotFoundException {


        //prompts user and stores input
        System.out.println("Welcome. Please enter the full filename of a .java file below: ");
        Scanner console = new Scanner(System.in);
        String userInput = console.nextLine();

        //opens objects to process user input
        File inputFile = new File(userInput);
        Scanner input = new Scanner (inputFile);
        PrintWriter output = new PrintWriter(userInput + ".txt");
        
        //prints lines from our source file to a new .txt file
        while(input.hasNext()){
            output.println(input.nextLine())
        }

        //close out objects
        input.close();
        output.close();
        console.close();

    }


    
}
