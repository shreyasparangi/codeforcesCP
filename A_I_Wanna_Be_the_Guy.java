import java.util.HashSet;
import java.util.Scanner;

public class A_I_Wanna_Be_the_Guy {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> set = new HashSet<>();
        int game_count = sc.nextInt();
        int x_count = sc.nextInt();
        for(int i=1; i<=x_count; i++){
            set.add(sc.nextInt());
        }
        int y_count = sc.nextInt();
        for(int i=1; i<=y_count; i++){
            set.add(sc.nextInt());
        }
        if(set.size()==game_count){
            System.out.println("I become the guy.");
        }
        else{
            System.out.println("Oh, my keyboard!");
        }
        sc.close();
    }
}