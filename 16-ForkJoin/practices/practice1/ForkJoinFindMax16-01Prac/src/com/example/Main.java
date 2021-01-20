package com.example;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    //We use a lot of memory
    //The project properties should have a Run, VM Option of -Xmx1024m
    public static void main(String[] args) { 
        int[] data = new int[1024 * 1024 * 128]; //512MB

       for (int i = 0; i < data.length; i++) {
            data[i] = ThreadLocalRandom.current().nextInt();
        }
/* 
        int max = Integer.MIN_VALUE;
        for (int value : data) {
            if (value > max) {
                max = value;
            }
        }
        System.out.println("Max value found:" + max);
        */
        ForkJoinPool pool = new ForkJoinPool();
        RandomArrayAction action = new RandomArrayAction(data, 0, data.length - 1, data.length / 16);
        
        pool.invoke(action);

        Instant before  = Instant.now();
        FindMaxTask task = new FindMaxTask(data, 0, data.length-1, data.length/16);
        Integer result = pool.invoke(task);
        Instant after  = Instant.now();
        System.out.println("Max:" + result + " IN " + before.until(after, ChronoUnit.MILLIS));
        
    }
}
