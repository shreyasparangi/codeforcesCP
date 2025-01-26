import java.util.Arrays;
import java.util.Scanner;

public class A_Plus_One_on_the_Subset {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0; i<n; i++){
                arr[i]=sc.nextInt();
            }
            Arrays.sort(arr);
            System.out.println(arr[n-1]-arr[0]);   
        }
        sc.close();
    }
}