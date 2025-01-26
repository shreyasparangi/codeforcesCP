import java.util.Scanner;
public class A_Brain_s_Photos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        //int m = sc.nextInt(); 
        sc.nextLine(); 
        boolean isColored = false;
        for (int i = 0; i < n; i++) {
            String[] row = sc.nextLine().split(" ");
            for (String pixel : row) {
                if (pixel.equals("C") || pixel.equals("M") || pixel.equals("Y")) {
                    isColored = true;
                    break;
                }
            }
            if (isColored) break;
        }

        System.out.println(isColored ? "#Color" : "#Black&White");
        sc.close();
    }
}