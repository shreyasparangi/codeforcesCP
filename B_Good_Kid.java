import java.util.Arrays;
import java.util.Scanner;

public class B_Good_Kid {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            long prod = 1;
            for(int i=0; i<n;i++){
                arr[i]=sc.nextInt();
            }
            Arrays.sort(arr);
            arr[0]++;
            for(int i=0; i<n; i++){
              prod *= arr[i];
            }
            System.out.println(prod);
        }
        sc.close();
    }
}