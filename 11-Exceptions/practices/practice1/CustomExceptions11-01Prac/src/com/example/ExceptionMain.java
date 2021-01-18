package com.example;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionMain {

    public static void main(String[] args) throws FileNotFoundException {

        try {
            // System.out.println("Reading from file:" + args[0]);
            BufferedReader b = new BufferedReader(new FileReader(args[0]));
            String s = null;

            while ((s = b.readLine()) != null) {
                System.out.println(s);
            }

            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("No file specified, quitting!");
            System.exit(1);

        } catch (IOException e) {
            // TODO Auto-generated catch block
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
            System.exit(1);
            
        }
        
    }
}
