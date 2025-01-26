import java.util.Scanner;

public class B_Balanced_Array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            long n = sc.nextLong();
            long sum1 = 0, sum2 = 0;
            
            if (n % 4 != 0) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
                
                // Add even numbers to sum1
                for (long i = 2; i <= n; i += 2) {
                    System.out.print(i + " ");
                    sum1 += i;
                }

                // Add odd numbers to sum2
                for (long i = 1; i < n - 2; i += 2) {
                    System.out.print(i + " ");
                    sum2 += i;
                }
                
                System.out.println(sum1 - sum2);
            }
        }
        
        sc.close();
    }
}