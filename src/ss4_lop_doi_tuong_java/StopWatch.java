package ss4_lop_doi_tuong_java;

import java.util.Scanner;
import java.util.Random;

public class StopWatch {
    private long startTime, endTime;

    StopWatch() {
    }

    long start() {
        return this.startTime = System.currentTimeMillis();
    }

    long stop() {
        return this.endTime = System.currentTimeMillis();
    }

    long getElapsedTime() {
        return this.endTime - this.startTime;
    }


    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        int[] arr = new int[100000];
        System.out.println("Start Time: " + stopWatch.start());
        for (int i = 0; i < arr.length; i++) {
            Random rand = new Random();
            arr[i] = rand.nextInt(1000)+1;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
        System.out.println("End Time: "+ stopWatch.stop());
        System.out.println("Elapsed Time: " + stopWatch.getElapsedTime() + "ms");
    }
}
