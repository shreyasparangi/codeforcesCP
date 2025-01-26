import java.util.Scanner;

public class A_Plus_or_Minus {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int j=0; j<t; j++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if(a+b==c){
                System.out.println("+");
            }
            else if(a-b==c){
                System.out.println("-");
            }
        }
        sc.close();
    }
}