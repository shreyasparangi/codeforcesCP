import java.util.Scanner;

public class A_Only_Pluses {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();
            for(long p = 0; p < 5; p++){
                if(a <= b && a <= c){++a;}
                else if(b <= a && b <= c){++b;}
                else if(c <= a && c <= b){++c;}
            }
            System.out.println(a*b*c);
        }
        sc.close();
    }
}