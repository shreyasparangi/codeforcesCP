import java.util.Scanner;

public class A_Dubstep {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        str = str.replace("WUB", " ");
        str = str.trim().replaceAll("\\s+", " ");
        System.out.println(str);
        sc.close();
    }
}