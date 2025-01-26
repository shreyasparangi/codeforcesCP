import java.util.Scanner;

public class A_Minutes_Before_the_New_Year {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int hours = sc.nextInt();
            int mins = sc.nextInt();
            int minsleft = (23-hours)*60+(60-mins);
            System.out.println(minsleft);
        }
        sc.close();
    }
}