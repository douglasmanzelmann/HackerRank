/**
 * Created by dmanzelmann on 9/15/14.
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class UtopianTree {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        Scanner input = new Scanner(System.in);
        int numberOfTestCases = input.nextInt();
        ArrayList<Integer> order = new ArrayList<Integer>(numberOfTestCases);
        int previousKey = -1;
        int previousValue = 0;
        int cycleNumber = 0;

        Map<Integer, Integer> testCases = new TreeMap<Integer, Integer>();

        for (int i = 0; i < numberOfTestCases; i++) {
            int numberOfCycles = input.nextInt();
            testCases.put(numberOfCycles, 1);
            order.add(numberOfCycles);
        }

        for(Map.Entry<Integer, Integer> entry : testCases.entrySet()) {
            int numberOfCycles;
            int initialHeight;

            if (previousKey == -1) {
                numberOfCycles = entry.getKey();
                initialHeight = entry.getValue();
            }
            else {
                numberOfCycles = entry.getKey() - previousKey;
                initialHeight = previousValue;

            }

            for (int i = 0; i < numberOfCycles; i++) {
                if (cycleNumber % 2 == 0)   {
                    initialHeight *= 2;
                }
                else {
                    initialHeight += 1;
                }
                cycleNumber++;
            }

            entry.setValue(initialHeight);
            previousKey = entry.getKey();
            previousValue = initialHeight;
        }

        for (Integer element : order) {
            System.out.println(testCases.get(element));
        }

        long elapsed = System.currentTimeMillis() - start;
        System.out.println("time: " + elapsed);
    }
}
