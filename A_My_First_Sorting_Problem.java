import java.util.Scanner;

public class A_My_First_Sorting_Problem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
           int x = sc.nextInt();
           int y = sc.nextInt();
           System.out.println(Math.min(x, y)+" "+Math.max(x, y));
        } 
        sc.close();
    }
}