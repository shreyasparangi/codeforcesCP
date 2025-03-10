import java.util.Scanner;

public class A_Colorful_Stones_Simplified_Edition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next(); // String s (stone colors)
        String t = sc.next(); // String t (instructions)
        sc.close();

        int pos = 0;

        // Traverse through the instruction string t
        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) == s.charAt(pos)) {
                pos++;
                if (pos == s.length()) {
                    break;
                }
            }
        }

        // Output the final position (1-based index)
        System.out.println(pos + 1);
    }
}
