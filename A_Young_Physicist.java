import java.util.Scanner;

public class A_Young_Physicist {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int xi = 0, yi = 0, zi = 0;
        while(n-->0){
            xi += sc.nextInt();
            yi += sc.nextInt();
            zi += sc.nextInt();
        }
        if(xi==0&&yi==0&&zi==0){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
        sc.close();
    }
}