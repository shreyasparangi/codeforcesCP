import java.util.Arrays;
import java.util.Scanner;

public class A_Remove_Smallest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        for(int i=0; i<n; i++){
            int size = sc.nextInt();
            int[] arr = new int[size];
            for(int j=0; j<size; j++){
                arr[j]=sc.nextInt();
            }
            Arrays.sort(arr);
            boolean possible = true;
            for(int j=1;j<size;j++){
                if(arr[j]-arr[j-1]>1){
                  possible=false;
                  break;
                }
            }
            System.out.println(possible?"YES":"NO");
        }
        sc.close();
    }
}