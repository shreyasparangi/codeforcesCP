import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class B_osu_mania {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
           int n = sc.nextInt();
           sc.nextLine();
           String[] strs = new String[n];
           for(int i=0; i<n; i++){
            strs[i] = sc.nextLine();
           }
           Collections.reverse(Arrays.asList(strs));
           for(int i=0; i<n; i++){
            if(strs[i].equals("#...")){
                System.out.print("1 ");
            }
            else if(strs[i].equals(".#..")){
                System.out.print("2 ");
            }
            else if(strs[i].equals("..#.")){
                System.out.print("3 ");
            }
            else{
                System.out.print("4 ");
            }
           }
           System.out.println();
        }
        sc.close();
    }
}