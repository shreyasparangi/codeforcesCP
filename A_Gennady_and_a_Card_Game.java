import java.util.Scanner;

public class A_Gennady_and_a_Card_Game {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String card = sc.next();
        String[] cards = new String[5];
        for (int i = 0; i < 5; i++) {
            cards[i] = sc.next();
        }
        boolean found = false;
        for (int i = 0; i < 5; i++) {
            if (cards[i].charAt(0) == card.charAt(0) || 
            cards[i].charAt(1) == card.charAt(1)) {
                found = true;
                break;
            }
        }
        System.out.println(found ? "YES" : "NO");
        sc.close();
    }
}