import java.util.Scanner;

public class A_Arithmetic_Array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int sum = 0;
            for(int i=0; i<n; i++)
            {
                a[i] = sc.nextInt();
                sum += a[i];
            }
            System.out.println(sum < n ? 1 : sum-n);          
        }
        sc.close();
    }
}