import java.util.Scanner;

public class A_Maximum_Increase {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int count = 1;
        int maxCount = 1;
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<n-1; i++){
            if(arr[i]<arr[i+1]){
            count++;
            maxCount = Math.max(maxCount, count);
            }
            else{
                count = 1;
            }
        }
        System.out.println(maxCount);
        sc.close();
    }
}