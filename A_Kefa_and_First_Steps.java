import java.util.Scanner;

public class A_Kefa_and_First_Steps {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int count = 1;
        int max = 1;
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<n-1; i++){
            if(arr[i]<=arr[i+1]){
                count++;
            }
            else{
                count = 1;
            }
            max = Math.max(max, count);
        }
        System.out.println(max);
        sc.close();
    }
}