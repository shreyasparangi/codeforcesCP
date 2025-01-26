import java.util.Scanner;

public class A_Theatre_Square {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read inputs
        long n = sc.nextLong(); // Length of the square
        long m = sc.nextLong(); // Width of the square
        long a = sc.nextLong(); // Side length of the tile

        // Calculate the number of tiles needed for length and width
        long tilesLength = (n + a - 1) / a;
        long tilesWidth = (m + a - 1) / a;

        // Total tiles needed
        long totalTiles = tilesLength * tilesWidth;

        // Output the result
        System.out.println(totalTiles);

        sc.close();
    }
}
