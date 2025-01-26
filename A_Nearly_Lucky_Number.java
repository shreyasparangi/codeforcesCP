import java.util.Scanner;

public class A_Nearly_Lucky_Number {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        int luckyCount = 0;
        
        // Count lucky digits (4 and 7)
        for (char c : n.toCharArray()) {
            if (c == '4' || c == '7') {
                luckyCount++;
            }
        }
        
        // Check if the count of lucky digits is 4 or 7
        if (luckyCount == 4 || luckyCount == 7) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        
        sc.close();
    }
}