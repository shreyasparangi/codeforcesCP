import java.util.Scanner;

public class A_Odd_One_Out {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0; i<t; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if(a==b){
                System.out.println(c);
            }
            else if(a==c){
                System.out.println(b);
            }
            else if(b==c){
                System.out.println(a);
            }
        }
        sc.close();
    }
}