import java.util.Scanner;

public class B_Gifts_Fixing {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            long count = 0;
            for(int i=0; i<n; i++){
                a[i]=sc.nextInt();
            }
            for(int i=0; i<n; i++){
                b[i]=sc.nextInt();
            }
            int minA = Integer.MAX_VALUE;
            int minB = Integer.MAX_VALUE;
            for(int i=0; i<n; i++){
                minA = Math.min(a[i], minA);
                minB = Math.min(b[i], minB);
            }
            for (int i = 0; i < n; i++) {
                count += Math.max(a[i] - minA, b[i] - minB);
            }
            
            System.out.println(count);

        }
        sc.close();
    }
}