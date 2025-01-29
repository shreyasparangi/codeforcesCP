import java.util.Scanner;

public class A_Easy_Problem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            System.out.println(sc.nextInt()-1);
        }
        sc.close();
    }
}