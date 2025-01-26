import java.util.Scanner;

public class A_Add_Odd_or_Subtract_Even {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a<b){
               System.out.println((b-a)%2!=0?1:2);
            }
            else if(a==b){
                System.out.println(0);
            }
            else if(a>b){
                System.out.println((a-b)%2==0?1:2);
            }
        }
        sc.close();
    }
}