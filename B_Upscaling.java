import java.util.Scanner;

public class B_Upscaling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong(); 
        while (t-- > 0) {
            long n = sc.nextLong();
            StringBuilder s = new StringBuilder();
            StringBuilder str = new StringBuilder();
            for (int p = 0; p < n; p++) {
                s.append((p % 2 != 0) ? ".." : "##");
                str.append((p % 2 != 0) ? "##" : "..");
            }
            for (int row = 0; row < 2 * n; row++) {
                System.out.println((row % 4 < 2) ? s.toString() : str.toString());
            }
        }

        sc.close();
    } 
}

