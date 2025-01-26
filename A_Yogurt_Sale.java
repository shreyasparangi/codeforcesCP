import java.util.Scanner;

public class A_Yogurt_Sale {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int costusingBundle = (n/2)*b + (n%2)*a;
            int costwithoutBundle = n*a;
            System.out.println(Math.min(costusingBundle, costwithoutBundle));
        }
        sc.close();
    }
}
