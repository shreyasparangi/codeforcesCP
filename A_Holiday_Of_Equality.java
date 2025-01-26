import java.util.Arrays;
import java.util.Scanner;

public class A_Holiday_Of_Equality {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int max = arr[n-1];
        int res=0;
        for(int i=0; i<n; i++){
         res += max-arr[i];
        }
        System.out.println(res);
        sc.close();
    }
}