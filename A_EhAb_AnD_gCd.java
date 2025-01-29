import java.util.Scanner;

public class A_EhAb_AnD_gCd {

    public static int gcd(int a, int b) { return b==0 ? a : gcd(b, a%b); }
    public static int lcm(int a, int b) { return (a*b)/gcd(a, b); }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            if(n%2==0){
                System.out.println(n/2+" "+n/2);
            }
            else if(n%2!=0){
                System.out.println((n-1)+" "+1);
            }
        }
        sc.close();
    }
}