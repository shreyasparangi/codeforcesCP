import java.util.Scanner;
public class A_A_B {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
           String str = sc.nextLine();
           int a = str.charAt(0)-'0';
           int b = str.charAt(2)-'0';
           System.out.println(a+b);
        }
        sc.close();
    }
}