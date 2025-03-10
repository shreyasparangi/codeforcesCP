import java.util.Scanner;

public class A_Elections {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            System.out.println(solveVotes(a,b,c)+" "+solveVotes(b,a,c)+" "+solveVotes(c,a,b));
        }
        sc.close();
    }
    public static int solveVotes(int best, int other1, int other2){
        return Math.max(0, Math.max(other1, other2) + 1 - best);
    }
}
