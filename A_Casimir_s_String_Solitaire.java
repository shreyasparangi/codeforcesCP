import java.util.Scanner;

public class A_Casimir_s_String_Solitaire {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            String str = sc.next();
            int a = countChar(str, 'A');
            int b = countChar(str, 'B');
            int c = countChar(str, 'C');
            System.out.println((a+c==b)?"YES":"NO");
        }
     sc.close();
    }              
    public static int countChar(String str, char c)
{
    return (int) str.chars().filter(ch -> ch == c).count();
}
}