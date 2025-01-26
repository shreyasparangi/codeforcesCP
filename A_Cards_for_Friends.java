import java.util.Scanner;

public class A_Cards_for_Friends {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int w = sc.nextInt();
            int h = sc.nextInt();
            int n = sc.nextInt();
            int papers = 1;

            while (w % 2 == 0) {
                w /= 2;
                papers *= 2;
            }
            while (h % 2 == 0) {
                h /= 2;
                papers *= 2;
            }

            System.out.println(papers >= n? "YES" : "NO");
        }
        
        sc.close();
    }
}
