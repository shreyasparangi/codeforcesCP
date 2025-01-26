import java.util.Arrays;
import java.util.Scanner;

public class B_Two_Arrays_And_Swaps {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                b[i] = sc.nextInt();
            }
            int sum = 0;
            Arrays.sort(a);
            Arrays.sort(b);
            for (int i = 0; i < k; i++) {
                if (i < n && b[n - 1 - i] > a[i]) {
                    a[i] = b[n - 1 - i];
                } else {
                    break; 
                }
            }
            for(int z=0; z<n; z++){
                sum += a[z];
            }
            System.out.println(sum);
        }
        sc.close();
    }
}