import java.util.Scanner;

/**
 * Created by dmanzelmann on 1/13/15.
 */
public class InsertionSortPart1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int arraySize = input.nextInt();
        input.nextLine();
        int[] arrayToSort = new int[arraySize];
        int v = 0;

        for (int i = 0; i < arraySize; i++) {
            arrayToSort[i] = input.nextInt();

            if (i == arraySize - 1)
                v = arrayToSort[i];
        }

        int i = arraySize-1;

        while (i > 0 && v <= arrayToSort[i-1]) {
            //System.out.println("aryToSort[i-1]: " + arrayToSort[i-1]);
            //System.out.println("i: " + i);
            if (arrayToSort[i-1] > v)
                arrayToSort[i] = arrayToSort[i-1];
            else if (arrayToSort[i-1] < v)
                arrayToSort[i] = v;

            for (int j = 0; j < arraySize; j++) {
                System.out.print(arrayToSort[j] + " ");
            }
            System.out.println();

            i--;
        }

        for (int j = 0; j < arraySize; j++)
            System.out.print(arrayToSort[j] + " ");
        System.out.println();

    }
}
