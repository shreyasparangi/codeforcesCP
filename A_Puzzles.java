import java.util.Arrays;
import java.util.Scanner;

public class A_Puzzles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt(); // Number of students
        int m = sc.nextInt(); // Number of puzzles
        
        int[] f = new int[m]; // Puzzle difficulty array
        
        for (int i = 0; i < m; i++) {
            f[i] = sc.nextInt();
        }
        
        sc.close();
        
        // Sort the array
        Arrays.sort(f);
        
        // Find the minimum difference
        int least = f[n - 1] - f[0];
        for (int i = 1; i <= m - n; i++) {
            least = Math.min(least, f[i + n - 1] - f[i]);
        }
        
        System.out.println(least);
    }
}