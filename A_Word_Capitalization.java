import java.util.Scanner;

public class A_Word_Capitalization {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        str = sc.nextLine();
        String first = str.substring(0, 1);
        String rest = str.substring(1);
        first = first.toUpperCase();
        str = first+rest;
        System.out.println(str);
        sc.close();

    }
}