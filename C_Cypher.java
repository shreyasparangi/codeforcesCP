
import java.util.Scanner;

public class C_Cypher {
    public static void solve(Scanner sc) {
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            int b = sc.nextInt();
            if (b == 0) {
                continue;
            }
            String now = sc.next();
            for (int j = 0; j < b; j++) {
                if (now.charAt(j) == 'U') {
                    a[i]--;
                } else if (now.charAt(j) == 'D') {
                    a[i]++;
                }
                if (a[i] < 0) {
                    a[i] += 10;
                }
                if (a[i] > 9) {
                    a[i] -= 10;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        while (t-- > 0) {
            solve(sc);
        }
        sc.close();
    }
}
 