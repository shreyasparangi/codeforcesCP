import java.util.Scanner;

public class A_Bear_and_Big_Brother {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int l = sc.nextInt();
        int b = sc.nextInt();
        while(l<=b){
            l = l*3;
            b = b*2;
            count++;
        }
        System.out.println(count);
        sc.close();
    }
}