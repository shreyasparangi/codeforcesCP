import java.util.Scanner;

public class A_Required_Remainder {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
           long x = sc.nextLong();
           long y = sc.nextLong();
           long n = sc.nextLong();
           long k = n - (n-y) % x;
           if(k > n){
            k -= x;
           }
           System.out.println(k);
        }
        sc.close();
    }
}

/*import java.util.Scanner;
 
public class A_Required_Remainder {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
           long x = sc.nextLong();
           long y = sc.nextLong();
           long n = sc.nextLong();
           long max = Math.max(x, Math.max(y, n));
           long k = max;
           while(k>0){
            if(k%x==y&&k<=n){
                break;
            }
            k--;
           }
           System.out.println(k);
        }
        sc.close();
    }
}*/