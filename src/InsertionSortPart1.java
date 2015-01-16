import java.util.Scanner;

/**
 * Created by dmanzelmann on 1/13/15.
 */
public class InsertionSortPart1 {



    public static void insertIntoSorted(int[] ar) {
        int v = 0;
        int j = ar.length-1;

        for (int i = 0; i < ar.length; i++) {
            if (i == ar.length-1)
                v = ar[i];
        }

        while (j > 0 && less(v, ar[j-1])) {
            ar[j] = ar[j-1];
            printArray(ar);
            j--;
            System.out.println("j: " + j);
        }

        ar[j] = v;
    }

    private static boolean less(Comparable v, Comparable w) {
        return (v.compareTo(w) < 0);
    }


    /* Tail starts here */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
        for(int i=0;i<s;i++){
            ar[i]=in.nextInt();
        }
        insertIntoSorted(ar);
        printArray(ar);
    }


    private static void printArray(int[] ar) {
        for(int n: ar){
            System.out.print(n+" ");
        }
        System.out.println("");
    }


}
