import java.util.Scanner;

public class A_Candies_and_Two_Sisters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Number of test cases

        while (t-- > 0) {
            long n = sc.nextLong();
            // Output the number of ways to split candies
            System.out.println((n > 2) ? (n - 1) / 2 : 0);
        }

        sc.close();
    }
}
