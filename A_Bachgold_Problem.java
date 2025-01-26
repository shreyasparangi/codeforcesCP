import java.util.Scanner;

public class A_Bachgold_Problem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int count = n / 2; 
        System.out.println(count);
        for (int i = 0; i < count-(n%2); i++) {
            System.out.print("2 ");
        }
        if (n % 2 != 0) {
            System.out.print("3");
        }
        
        
    }
}