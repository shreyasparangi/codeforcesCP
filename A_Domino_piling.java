import java.util.Scanner;

public class A_Domino_piling {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int res;
        int m = sc.nextInt();
        int n = sc.nextInt();
        sc.close();
        if((m*n)%2==0){
            res = (m*n)/2;
        }
        else{
            res = ((m*n)-1)/2;
        }
        System.out.println(res);

    }
}