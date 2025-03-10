import java.util.Scanner;

public class A_Turtle_Puzzle_Rearrange_and_Negate {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int t = sc.nextInt();
         while (t-->0) {
            int n = sc.nextInt();
            int sum = 0;
            int[] arr = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = Math.abs(sc.nextInt());
                sum += arr[i];
            }
            System.out.println(sum);
         }
        
        sc.close();
    }
}