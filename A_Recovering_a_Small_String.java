import java.util.*;

public class A_Recovering_a_Small_String {
    public static void solve(Scanner sc) {
        int n;
        int sz = 26;
        n = sc.nextInt();
        String mins = "zzz", cur;   
        for (int i = 0; i < sz; i++) {
            for (int j = 0; j < sz; j++) {
                for (int k = 0; k < sz; k++) {
                    if (i + j + k + 3 == n) {
                        cur = "" + (char)(i + 'a') + (char)(j + 'a') + (char)(k + 'a');
                        mins = mins.compareTo(cur) > 0 ? cur : mins;
                    }
                }
            }
        }
        System.out.println(mins);
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