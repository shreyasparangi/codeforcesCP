import java.util.Scanner;

public class A_Tram {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int stops = sc.nextInt();
        int enter, out, i, rem = 0, max = 0;
        for (i = 0; i < stops; i++) {
            out = sc.nextInt();
            enter = sc.nextInt();
            if (i == 0) {
                rem = enter;
                max = rem;
            } else {
                rem += enter - out;
                max = Math.max(max, rem);
            }
            sc.close();
        }
        System.out.println(max);
    }
}