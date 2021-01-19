package com.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class FileScanInteractive {

    public int countTokens(String file, String search) throws IOException {
        int instanceCount = 0;
        try (FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);
                Scanner s = new Scanner(br)) {
            s.useDelimiter("\\W");
            while (s.hasNext()) {
                if (search.equalsIgnoreCase(s.next().trim())) {
                    instanceCount++;
                }
            }
        } // try-with-resources will close the connections
        return instanceCount;
    }

    public static void main(String[] args) {
        // Your code goes here
        if (args.length < 1) {
            System.out.println("Args less than one");
            System.exit(-1);
        }

        String firstArg = args[0];
        FileScanInteractive scan = new FileScanInteractive ();
  
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String search = "";
            System.out.println ("Local File: " + firstArg);
            
            while (true) {
                System.out.print("Enter the search string or q to exit: ");
                search = reader.readLine().trim();
                if (search.equalsIgnoreCase("q")) break;
                  

            int count = scan.countTokens(firstArg, search);
            System.out.println("The word \"" + search + "\" appears " + count + " times in the file");
            }

        } catch (IOException e) {
             System.out.println("Exception: " + e);
             System.exit(-1);
        }
        
        

       
    }
}