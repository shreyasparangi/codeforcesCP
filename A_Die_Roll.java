import java.util.Scanner;

public class A_Die_Roll {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Y = sc.nextInt();
        int W = sc.nextInt();
        int maxRoll = Math.max(Y, W);
        int favorableOutcomes = 7 - maxRoll;
        int totalOutcomes = 6;
        int gcd = gcd(favorableOutcomes, totalOutcomes);
        System.out.println((favorableOutcomes / gcd) + "/" + (totalOutcomes / gcd));

        sc.close();
    }
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}