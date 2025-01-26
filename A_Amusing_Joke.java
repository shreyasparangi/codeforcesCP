import java.util.Arrays;
import java.util.Scanner;

public class A_Amusing_Joke {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String pile = sc.nextLine();
        String join = s1+s2;
        char[] joinarr = join.toCharArray();
        Arrays.sort(joinarr);
        char[] pilearr = pile.toCharArray();
        Arrays.sort(pilearr);
        if(Arrays.equals(joinarr, pilearr)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
        sc.close();
    }
}