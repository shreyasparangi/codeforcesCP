import java.util.Arrays;
import java.util.Scanner;

public class A_Twins {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0, tot=0, count=0;
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
            tot += arr[i];
        }
        Arrays.sort(arr);
        for(int i=n-1; i>=0; i--){
            if(sum<=tot/2){
                sum += arr[i];
                count++;
            }
        }
        System.out.println(count);
        sc.close();

    }
}