import java.util.Scanner;

public class A_Two_Vessels {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int diff = Math.abs(a - b);
            int steps = (diff + 2 * c - 1) / (2 * c); 
            System.out.println(steps);
        }
        sc.close();
    }
}
/*import java.util.Scanner;

public class A_Two_Vessels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int count = 0;
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            
            // Difference between a and b
            int diff = Math.abs(a - b);
            
            // Since each move reduces the difference by 2 * c, we check how many steps it takes
            while (diff > 0) {
                if (diff <= 2 * c) {
                    count++;
                    break;
                } else {
                    diff -= 2 * c;
                    count++;
                }
            }

            System.out.println(count);
        }
        
        sc.close();
    }
}*/
