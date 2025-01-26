import java.util.Arrays;
import java.util.Scanner;

public class B_Increasing {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
           int n = sc.nextInt();
           boolean isIncreasing = true;
           int[] arr = new int[n];
           for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
           }
           Arrays.sort(arr);
           for(int i=1; i<n; i++){
            if(arr[i]==arr[i-1]){
              isIncreasing = false;
            }
           }
           if(isIncreasing){
            System.out.println("YES");
           }
           else{
            System.out.println("NO");
           }
        }
        sc.close();
    }
}