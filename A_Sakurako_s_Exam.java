import java.util.Scanner;

public class A_Sakurako_s_Exam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            if (a % 2 == 1) {
                System.out.println("NO");
                continue;
            }
            if (a == 0 && b % 2 == 1) {
                System.out.println("NO");
                continue;
            }
            System.out.println("YES");
        }
        sc.close();
    }
} 