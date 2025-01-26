import java.util.Scanner;

public class A_Design_Tutorial_Learn_from_Math {

    // Method to check if a number is composite (not prime and greater than 1)
    public static boolean isComposite(int n) {
        if (n <= 1) return false; // Numbers less than or equal to 1 are not composite
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return true; // Composite number found
        }
        return false; // Otherwise, it's not composite
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        int a, b;
        // Find two composite numbers whose sum equals `num`
        for (a = 4; a < num; a++) { // Start `a` from 4 (first composite number)
            b = num - a;
            if (isComposite(a) && isComposite(b)) {
                System.out.println(a + " " + b);
                break;
            }
        }
        sc.close();
    }
}
