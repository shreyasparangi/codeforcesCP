import java.util.Scanner;

public class A_Soldier_and_Bananas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int w = sc.nextInt();
        int total=0;
        for(int i=1; i<=w; i++){
            total += i*k;
        }
        System.out.println(Math.max(0, total-n));
        sc.close();
    }
}