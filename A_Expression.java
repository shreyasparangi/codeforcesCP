import java.util.Scanner;

public class A_Expression {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max = a+b+c;
        max = Math.max(max,Math.max((a + b * c), Math.max(a * (b + c), Math.max(a * b * c, (a + b) * c))));
        System.out.println(max);
        sc.close();
    }
}