import java.util.Scanner;

public class A_Mahmoud_and_Ehab_and_the_even_odd_game {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n%2==0?"Mahmoud":"Ehab");
        sc.close();
    }
}