import java.util.Scanner;
public class B_Equal_Candies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int total_eat = 0, min = Integer.MAX_VALUE;
            for(int i=0; i<n; i++){
                int candy = sc.nextInt();
                total_eat += candy;
                min = Math.min(min, candy);
            }
            System.out.println(total_eat-(min*n));
        }
        sc.close();
    }
}