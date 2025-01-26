import java.util.Scanner;

public class A_Most_Unstable_Array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            long n = sc.nextInt();
            long m = sc.nextInt();
            if(n==1){
                System.out.println(0);
            }
            else if(n==2){
                System.out.println(m);
            }
            else if(n>2){
                System.out.println(m*2);
            }
        }
        sc.close();
    }
}