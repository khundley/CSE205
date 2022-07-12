//********************************************************************************************************
// CLASS: Main
//
// DESCRIPTION
// This file includes methods which read in integers from an input text file (p01-in.txt), storing them 
// within an ArrayList. This array list is then scanned for increasing and decreasing sequences of 
// numbers. The quantity and length of these sequences is then printed to a new file (p01-runs.txt).
//
// COURSE AND PROJECT INFO
// CSE205 Object Oriented Programming and Data Structures, Summer Session B 2022 // Project Number: 01
// TEAM: TEAM 5
// AUTHORS:
// ANDREW BRAND   | ABRAND3  | A.BRAND101691@YAHOO.COM
// KENYON HUNDLEY | KHUNDLEY | KENYONHUNDLEY@YAHOO.COM
// ISAIAH POTTS   | IPOTTS1  | ZAHPOTTS123@GMAIL.COM
// ANTHONY SPAUGH | ASPAUGH  | ASPAUGH@ASU.EDU
//********************************************************************************************************

import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Main mainObj = new Main();
        mainObj.run();
    }

    private void run() throws FileNotFoundException {

        // attempting to open the input file
        String desiredFile = "p01-in.txt";
        File inFile = new File(desiredFile);
        Scanner input = null;
        try {
            input = new Scanner(inFile);
        } catch (FileNotFoundException fnfInputException) {
            System.out.println("Dearest apologies, the file " + desiredFile + " was unable to be opened.");
            System.exit(-100);
        }

        // attempting to open the output file
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

        executeOps(list, outFile);

        outFile.close();
        input.close();



    }

    /* 
    * executeOps() carries out the main functions of this program, using one
    * for loop to calculate the total # of runs, and another to identify the total
    * # of runs to each run length possible.
    */
    private void executeOps(ArrayList<Integer> list, PrintWriter output) {
        int totalRuns = 0;
        for (int i = 1; i < list.size(); i++){
            totalRuns += runsUp(list, i) + runsDown(list, i);
        }
        output.println("runs_total: " + totalRuns);
        
        for (int i = 1; i < list.size(); i++){
            int runs = runsUp(list, i) + runsDown(list, i);
            output.println("runs_"+i+": "+runs);
        }
    }

    /*
    * runsUp() progresses through the provided list, checking for sequences of increasing
    * numbers. Once a sequence is detected, its length is checked against our desired run
    * length. Each time a match occurs, int total is incremented by 1. total is 
    * returned at the end, identifying the total of number of runs which match our desiredRunLength.
    */    
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
                i=j;
            }
        }
        return total;
    }

    /*
    * runsDown() progresses through the provided list, checking for sequences of decreasing
    * numbers. Once a sequence is detected, its length is checked against our desired run
    * length. Each time a match occurs, int total is incremented by 1. total is 
    * returned at the end, identifying the total of number of runs which match our desiredRunLength.
    */
    private int runsDown(ArrayList<Integer> list, int desiredRunLength){
        int total = 0;
        int length = list.size();
        for(int i = 0; i < length; i++){
            if (i != (length-1) && desiredRunLength <= (length-1-i) && list.get(i) > list.get(i+1)){
                int tempRunLength = 1;
                int j = i+1;
                while(j != length-1 && list.get(j) > list.get(j+1)){
                    j++;
                    tempRunLength++;
                }

                if (tempRunLength == desiredRunLength) {
                    total++;
                }
                i=j;
            }
        }
        return total;
    }
    
}