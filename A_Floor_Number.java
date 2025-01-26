import java.util.Scanner;

public class A_Floor_Number {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        while (t-- > 0) {
            int n = sc.nextInt(); 
            int x = sc.nextInt(); 
            int floor;
            if (n <= 2) {
                floor = 1; // Apartments 1 and 2 are always on the 1st floor
            } else {
                floor = (n - 3) / x + 2; // Subtract the first floor's 2 apartments and calculate remaining floors
            }
            
            System.out.println(floor);
        }
        sc.close();
    }
}
