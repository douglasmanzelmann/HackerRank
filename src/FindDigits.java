import java.util.Scanner;

/**
 * Created by douga_000 on 12/30/2014.
 */
public class FindDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numTestCases = input.nextInt();
        input.nextLine();

        for (int i = 0; i < numTestCases; i++) {
            int totalDivisors = 0;
            String strDigits = input.nextLine();
            int digits = Integer.parseInt(strDigits);

            for (int j = 0; j < strDigits.length(); j++) {
                int currentDigit = Integer.parseInt(strDigits.substring(j, j+1));
                if (currentDigit != 0) {
                    if (digits % currentDigit == 0)
                        totalDivisors++;
                }
            }
            System.out.println(totalDivisors);
        }
    }
}
