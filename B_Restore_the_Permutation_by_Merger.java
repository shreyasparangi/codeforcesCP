import java.util.*;
import java.util.Scanner;

public class B_Restore_the_Permutation_by_Merger {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            LinkedHashSet<Integer> set = new LinkedHashSet<>(); //Stores data in sequence of insertion
            for(int i=0; i<2*n; i++){
                set.add(sc.nextInt());
            }
            for(int i : set){
                System.out.print(i+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}