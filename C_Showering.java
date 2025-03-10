import java.util.*;

public class C_Showering {
    public static void solve(Scanner sc) {
        int n = sc.nextInt();
        int s = sc.nextInt();
        int m = sc.nextInt();
        
        List<int[]> list = new ArrayList<>();
        list.add(new int[]{0, 0});
        list.add(new int[]{m, m});
        
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            list.add(new int[]{a, b});
        }
        
        list.sort(Comparator.comparingInt(arr -> arr[0]));
        
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i)[0] - list.get(i - 1)[1] >= s) {
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
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