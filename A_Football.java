import java.util.Scanner;

public class A_Football {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        
        if (str.contains("0000000") || str.contains("1111111")) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
