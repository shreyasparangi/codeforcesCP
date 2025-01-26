import java.util.Scanner;

public class A_Calculating_Function {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        long result;

        // If num is even
        if (num % 2 == 0) {
            result = num / 2;
        } else { // If num is odd
            result = -(num / 2 + 1);
        }

        System.out.println(result);
        sc.close();
    }
}
