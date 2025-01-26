import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class A_Boy_or_Girl {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        
        // Use a Set to store distinct characters
        Set<Character> distinctLetters = new HashSet<>();
        for (char c : name.toCharArray()) {
            distinctLetters.add(c);
        }

        if (distinctLetters.size() % 2 == 0) {
            System.out.println("CHAT WITH HER!");
        } else {
            System.out.println("IGNORE HIM!");
        }
        sc.close();
    }
}
