import java.util.Scanner;

public class A_Petya_and_Strings {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        // Compare lexicographically ignoring case
        int result = s1.compareToIgnoreCase(s2);

        if (result == 0) {
            System.out.println(0);  // Strings are equal ignoring case
        } else if (result > 0) {
            System.out.println(1);  // First string is lexicographically greater
        } else {
            System.out.println(-1);  // Second string is lexicographically greater
        }
        sc.close();
    }
}
