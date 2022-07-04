import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
public class Main {
    public static void main(String[] args){
        Main mainObj = new Main();
        mainObj.run();
    }

    private void run(){

        //attempting to open the input file
        File inFile;
        try {
            inFile = new File("p01-in.txt");
        } catch (FileNotFoundException fnfInputException) {
            System.out.println("Dearest apologies, the file p01-in.txt was unable to be opened.");
            System.exit(-100);
        }

        //attempting to open the output file
        PrintWriter outFile;
        try {
            outFile = new PrintWriter("p01-runs.txt")
        } catch (FileNotFoundException fnfOutputException) {
            System.out.println("Dearest apologies, the file p01-runs.txt was unable to be opened.");
            System.exit(-200);
        }

        //declaring an ArrayList object and filling it with values from the input file
        ArrayList<Integer> list = new ArrayList<>();
        Scanner input = new Scanner(inFile);
        while(input.hasNextInt()){
            list.add(input.nextInt());
        }

        for (int i = 0; i < 12; i++){
            int runs = runsUp(list, i) + runsDown(list, i);
        }


    }

    private int runsUp(ArrayList<Integer> list, int desiredRunLength){
        int total = 0;
        return total;
    }

    private int runsDown(ArrayList<Integer> list, int desiredRunLength){
        int total = 0;
        return total;
    }
    
}
