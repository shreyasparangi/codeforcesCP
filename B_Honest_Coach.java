import java.util.Arrays;
import java.util.Scanner;

public class B_Honest_Coach {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            int diff = Integer.MAX_VALUE; 
            for (int i = 1; i < n; i++) {
                diff = Math.min(diff, arr[i] - arr[i - 1]); 
            }
            System.out.println(diff);
        }
        sc.close();
    }
}