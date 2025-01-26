import java.util.ArrayList;
import java.util.Scanner;

public class A_Sum_of_Round_Numbers {

   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Number of test cases
        while (t-- > 0) {
            int n = sc.nextInt(); // Input number
            ArrayList<Integer> roundNumbers = new ArrayList<>();

            int placeValue = 1; // Tracks the current place value (1, 10, 100, ...)
            while (n > 0) {
                int digit = n % 10; // Extract the last digit
                if (digit != 0) {
                    roundNumbers.add(digit * placeValue); // Form the round number
                }
                n /= 10; // Remove the last digit
                placeValue *= 10; // Move to the next place value
            }

            // Output the result
            System.out.println(roundNumbers.size());
            for (int i = roundNumbers.size() - 1; i >= 0; i--) {
                System.out.print(roundNumbers.get(i) + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}