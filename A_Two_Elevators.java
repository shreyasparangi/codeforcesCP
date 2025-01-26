import java.util.Scanner;

public class A_Two_Elevators {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d1 = a - 1;
            int d2 = Math.abs(b - c) + (c - 1);
            int ans = 0;
            if (d1 <= d2) {
                ans += 1;
            }
            if (d1 >= d2) {
                ans += 2;
            }
            System.out.println(ans);
        }
        sc.close();
    }
}