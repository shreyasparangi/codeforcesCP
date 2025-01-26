import java.util.Scanner;

public class A_Presents {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            result[a[i] - 1] = i + 1; 
        }
        for (int x : result) {
            System.out.print(x + " ");
        }
        sc.close();
    }
}
