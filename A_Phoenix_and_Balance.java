import java.util.Scanner;

public class A_Phoenix_and_Balance {

    public static void solve(Scanner sc) {
        int N = sc.nextInt();
        int sum1 = 1 << N, sum2 = 0;

        for (int i = 1; i < N / 2; i++) {
            sum1 += 1 << i;
        }

        for (int i = N / 2; i < N; i++) {
            sum2 += 1 << i;
        }
        
        System.out.println(sum1 - sum2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            solve(sc);
        }
        sc.close();
    }
}