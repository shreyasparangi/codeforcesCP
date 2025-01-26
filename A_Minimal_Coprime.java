import java.util.Scanner;

public class A_Minimal_Coprime {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println((a==1&&b==1)? 1: b-a);
        }
        sc.close();
    }
}