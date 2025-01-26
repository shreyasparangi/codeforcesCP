import java.util.Scanner;
import java.util.StringJoiner;

public class A_Hulk {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        StringJoiner str = new StringJoiner(" ");
        
        for(int i = 1; i <= n; i++) {
            if(i % 2 != 0) {
                str.add("I hate");
            } else {
                str.add("I love");
            }
            
            if(i != n) {
                str.add("that");
            }
        }
        
        str.add("it");
        
        System.out.println(str.toString());
        sc.close();
    }
}
