import java.util.HashSet;
import java.util.Scanner;

public class A_Is_your_horseshoe_on_the_other_hoof {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> set = new HashSet<>();
        int res=0;
        for(int i=0; i<4; i++){
            set.add(sc.nextInt());
        }
            res = 4-set.size();
            System.out.println(res);
            sc.close();
    }
}