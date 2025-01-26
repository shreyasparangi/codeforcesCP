import java.util.HashSet;
import java.util.Scanner;

public class A_Anton_and_Letters {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        HashSet<Character> set = new HashSet<>();
        for(char c: str.toCharArray()){
            if(Character.isLetter(c)){
                set.add(c);
            }   
        }
        System.out.println(set.size());
        sc.close();

    }
}