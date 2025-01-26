import java.util.Scanner;

public class A_Lucky_Division {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();

        int[] luckyNumbers = {4, 7, 47, 74, 44, 77, 447, 477, 744, 774, 747, 474};
        boolean isLucky = false;

        for (int lucky : luckyNumbers) {
            if (num % lucky == 0) {
                isLucky = true;
                break;
            }
        }

        System.out.println(isLucky ? "YES" : "NO");
    }
}
