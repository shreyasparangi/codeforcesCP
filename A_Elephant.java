import java.util.Scanner;

public class A_Elephant {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Calculate minimum steps required
        int count = (n + 4) / 5; // Adding 4 ensures rounding up for any remainder

        System.out.println(count);
        sc.close();
    }
}
