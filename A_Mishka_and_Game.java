import java.util.Scanner;

public class A_Mishka_and_Game {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int mwin=0,cwin=0;
        for(int i=0; i<t; i++){
            int m = sc.nextInt();
            int c = sc.nextInt();
            if(m>c){
                mwin++;
            }
            else if(c>m){
                cwin++;
            }
        }
        if(mwin>cwin){
            System.out.println("Mishka");
        }
        else if(mwin<cwin){
            System.out.println("Chris");
        }
        else{
            System.out.println("Friendship is magic!^^");
        }
        sc.close();
    }
}