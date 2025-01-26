import java.util.Arrays;
import java.util.Scanner;

public class A_Puzzles {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[m];
        for(int i=0; i<m; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int mindiff = Integer.MAX_VALUE;
        for(int k=1; k<m-n; k++){
            mindiff = Math.min(mindiff, arr[k+n-1] - arr[k]);
        }
        System.out.println(mindiff);
        sc.close();
    }
}