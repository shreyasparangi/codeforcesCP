import java.util.Scanner;

public class C_Clock_Conversion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String str = sc.next();
            int hours = Integer.parseInt(str.substring(0, 2));
            int mins = Integer.parseInt(str.substring(3, 5));

            if (hours == 0) {
                // Midnight case
                System.out.printf("12:%02d AM\n", mins);
            } else if (hours >= 1 && hours < 12) {
                // AM case (1 to 11)
                System.out.printf("%02d:%02d AM\n", hours, mins);
            } else if (hours == 12) {
                // Noon case
                System.out.printf("12:%02d PM\n", mins);
            } else {
                // PM case (after 12)
                System.out.printf("%02d:%02d PM\n", hours - 12, mins);
            }
        }
        sc.close();
    }
}
