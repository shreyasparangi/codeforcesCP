import java.util.Scanner;

public class A_Dislike_of_Threes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Number of test cases
        for (int j = 0; j < t; j++) {
            int n = sc.nextInt(); // Position of the number to find
            int num = 0, count = 0; // `num` checks each number, `count` tracks valid numbers

            while (count < n) {
                num++; // Increment number to check
                if (num % 3 == 0 || num % 10 == 3) {
                    continue; // Skip numbers divisible by 3 or ending in 3
                }
                count++; // Valid number, increment count
            }
            System.out.println(num); // Output nth valid number
        }
        sc.close();
    }
}
