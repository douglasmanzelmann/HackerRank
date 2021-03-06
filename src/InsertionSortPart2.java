import java.util.Scanner;

/**
 * Created by dmanzelmann on 1/14/15.
 */
public class InsertionSortPart2 {
    public static void insertionSortPart2(int[] ar) {
        for (int i = 0; i < ar.length-1; i++) {
            for (int j = i+1; j > 0; j--) {
                if (ar[j] < ar[j-1]) {
                    int temp = ar[j-1];
                    ar[j-1] = ar[j];
                    ar[j] = temp;
                }
            }
            printArray(ar);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
        for(int i=0;i<s;i++){
            ar[i]=in.nextInt();
        }
        insertionSortPart2(ar);

    }

    private static void printArray(int[] ar) {
        for(int n: ar){
            System.out.print(n+" ");
        }
        System.out.println("");
    }
}
