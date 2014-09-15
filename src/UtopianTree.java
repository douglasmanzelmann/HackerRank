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
        Scanner input = new Scanner(System.in);
        int numberOfTestCases = input.nextInt();
        int previousKey = -1;
        int previousValue = 0;

        Map<Integer, Integer> testCases = new TreeMap<Integer, Integer>();

        for (int i = 0; i < numberOfTestCases; i++) {
            testCases.put(input.nextInt(), 1);
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
                if (numberOfCycles % 2 == 0)
                    initialHeight *= 2;
                else
                    initialHeight += 1;
            }

            entry.setValue(initialHeight);
            System.out.println(initialHeight);
            previousKey = entry.getKey();
            previousValue = initialHeight;
        }
    }
}
