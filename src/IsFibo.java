import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by douga_000 on 12/30/2014.
 */
public class IsFibo {
    private HashSet<Long> calculatedFibonacci;
    private ArrayList<Long> fibList;

    public IsFibo() {
        calculatedFibonacci = new HashSet<Long>();
        fibList = new ArrayList<Long>();
        fibList.add(Long.valueOf(0));
        fibList.add(Long.valueOf(1));
    }

    public boolean fibo(Long n) {
        Long fibo = Long.valueOf(0);

        if(calculatedFibonacci.contains(n))
            return true;

        while (fibo <= n) {
            int size = fibList.size();
            Long nMinusOne = fibList.get(fibList.size() - 1);
            Long nMinusTwo = fibList.get(fibList.size() - 2);
            fibo = nMinusOne + nMinusTwo;
            fibList.add(fibo);
            calculatedFibonacci.add(fibo);

            if (fibo == n) {

                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        IsFibo fibo = new IsFibo();
        int numTestCases = input.nextInt();
        input.nextLine();

        for (int i = 0; i < numTestCases; i++) {
            Long current = Long.parseLong(input.nextLine());
            if (fibo.fibo(current))
                System.out.println("IsFibo");
            else
                System.out.println("IsNotFibo");
        }
    }
}
