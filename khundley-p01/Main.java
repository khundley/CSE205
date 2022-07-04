import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Main mainObj = new Main();
        mainObj.run();
    }

    private void run() throws FileNotFoundException {

        //attempting to open the input file
        String desiredFile = "p01-in.txt";
        File inFile = new File(desiredFile);
        Scanner input = null;
        try {
            input = new Scanner(inFile);
        } catch (FileNotFoundException fnfInputException) {
            System.out.println("Dearest apologies, the file " + desiredFile + " was unable to be opened.");
            System.exit(-100);
        }

        //attempting to open the output file
        PrintWriter outFile = null;
        try {
            outFile = new PrintWriter("p01-runs.txt");
        } catch (FileNotFoundException fnfOutputException) {
            System.out.println("Dearest apologies, the file p01-runs.txt was unable to be opened.");
            System.exit(-200);
        }

        //declaring an ArrayList object and filling it with values from the input file
        ArrayList<Integer> list = new ArrayList<>();
        while(input.hasNextInt()){
            list.add(input.nextInt());
        }

        for (int i = 1; i < 12; i++){
            int runs = runsUp(list, i) + runsDown(list, i);
            System.out.println("runs_"+i+": "+runs);
        }

        outFile.close();
        input.close();



    }

    //runsUp()
    private int runsUp(ArrayList<Integer> list, int desiredRunLength){
        int total = 0;
        int length = list.size();
        for(int i = 0; i < length; i++){
            if (i != (length-1) && desiredRunLength <= (length-1-i) && list.get(i)< list.get(i+1)){
                int tempRunLength = 1;
                int j = i+1;
                while(j != length-1 && list.get(j)< list.get(j+1)){
                    j++;
                    tempRunLength++;
                }

                if (tempRunLength == desiredRunLength) {
                    total++;
                }
            }
        }
        return total;
    }

    //runsDown() 
    private int runsDown(ArrayList<Integer> list, int desiredRunLength){
        int total = 0;
        return total;
    }
    
}
