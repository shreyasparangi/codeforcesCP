import java.util.ArrayList;
import java.util.Scanner;

public class A_Team_Olympiad {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Number of students
        ArrayList<Integer> math = new ArrayList<>();
        ArrayList<Integer> prog = new ArrayList<>();
        ArrayList<Integer> eu = new ArrayList<>();

        // Input and categorize students
        for (int i = 1; i <= n; i++) {
            int x = sc.nextInt();
            if (x == 1) {
                prog.add(i); // Programmer
            } else if (x == 2) {
                math.add(i); // Mathematician
            } else if (x == 3) {
                eu.add(i); // PE student
            }
        }

        // Calculate the number of teams that can be formed
        int ans = Math.min(math.size(), Math.min(prog.size(), eu.size()));
        System.out.println(ans);

        // Print the teams
        for (int i = 0; i < ans; i++) {
            System.out.println(prog.get(i) + " " + math.get(i) + " " + eu.get(i));
        }

        sc.close();
    }
}
