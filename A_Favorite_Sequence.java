import java.util.Scanner;

public class A_Favorite_Sequence {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
           int n = sc.nextInt();
           int[] arr = new int[n];
           for(int i=0; i<n; i++){
             arr[i] = sc.nextInt();
           }
           int left = 0, right = n-1;
           while(left<=right){
            System.out.print(arr[left++]+" ");
            if(left<=right){
            System.out.print(arr[right--]+" ");
            }
           }
           System.out.println();
        }
        sc.close();
    }
}