import java.util.*;

public class A_Robin_Helps {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();  // Number of test cases
        while (t-- > 0) {
            int n = scanner.nextInt(); // Number of people
            int k = scanner.nextInt(); // Gold threshold
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            int robin = 0;
            int count = 0;
            for (int gold : a) {
                if (gold >= k) {
                 robin += gold; // Take all gold if >= k
                } else if (gold == 0 && robin > 0) {
                 robin--;  // Give 1 gold
                    count++; // Count this person
                }
            }
            System.out.println(count);
        }
        scanner.close();
    }
}
/*import java.util.Scanner;

public class A_Robin_Helps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int robin = 0, count = 0;
            int n = sc.nextInt();
            int k = sc.nextInt();

            for (int i = 0; i < n; i++) {
                int num = sc.nextInt();
                if (num >= k) {
                    robin += num - k; // Excess over k
                } else if (num == 0 && robin>0) {
                    count++; // Count zero elements
                }
            }
            System.out.println(Math.min(robin, count)); // Output the minimum of robin or count
        }
        sc.close(); // Scanner closed after all inputs are processed
    }
}*/
