import java.util.Scanner;

public class A_A_B_Again {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0; i<t; i++){
            int num = sc.nextInt();
            int sum = (num/10)+(num%10);
            System.out.println(sum);
        }
        sc.close();
    }
}