import java.util.Arrays;
import java.util.Scanner;

public class B_Atilla_s_Favorite_Problem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            String str = sc.next();
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            System.out.println((arr[n-1]-'a')+1);
        }
        sc.close();
    }
}