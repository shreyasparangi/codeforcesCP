import java.util.Scanner;

public class A_Game_with_Integers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int num = sc.nextInt();
            if((num+1)%3==0||(num-1)%3==0){
                System.out.println("First");
            }
            else{
                System.out.println("Second");
            }
        }
        sc.close();
    }
}