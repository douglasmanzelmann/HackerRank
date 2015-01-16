/**
 * Created by dmanzelmann on 9/12/14.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class GemStones {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named InsertionSortPart1. */
        Scanner input = new Scanner(System.in);
        Set<Character> gems = new HashSet<Character>();

        int numberOfRocks = input.nextInt();
        input.nextLine();

        System.out.println("Enter first rock: ");
        String rock = input.nextLine();

        for (int i = 0; i < rock.length(); i++) {
            gems.add(rock.charAt(i));
        }

        for (int i = 1; i < numberOfRocks; i++) {
            rock = input.nextLine();

            Iterator<Character> iterator = gems.iterator();

            while (iterator.hasNext()) {
                Character chr = iterator.next();
                if (rock.indexOf(chr) == -1 ) {
                    iterator.remove();
                }
            }


            for (Character item : gems) {
                if (rock.indexOf(item) == -1) {
                    gems.remove(item);
                }
            }
        }

        System.out.println(gems.size());
    }
}
