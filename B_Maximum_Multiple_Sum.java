import java.util.Scanner;

public class B_Maximum_Multiple_Sum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int maxsum = 0;
            int optimal = 0;
            for(int i=2; i<=n; i++){
               int k = n/i;
               int currentSum = i*(k*(k+1)/2);
               if (currentSum > maxsum) {
                maxsum = currentSum; 
                optimal = i; 
            }
            }
             System.out.println(optimal);
        }
        sc.close();
    }
}