import java.util.Scanner;

public class A_Special_Permutation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            int[] perm = new int[n];
            for (int i = 0; i < n - 1; i += 2) {
                perm[i] = i + 2;
                perm[i + 1] = i + 1;
            }
            if (n % 2 == 1) { // Handle odd n case
                perm[n - 1] = perm[n - 2];
                perm[n - 2] = n;
            }
            for(int num: perm){
                System.out.print(num+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}