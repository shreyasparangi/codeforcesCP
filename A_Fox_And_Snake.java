import java.util.Scanner;

public class A_Fox_And_Snake {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for(int i=1; i<=n; i++){
            if(i%4==0){
                    System.out.print("#"+".".repeat(m-1)+"\n");
                }
            else if(i%2==0){
                    System.out.print(".".repeat(m-1)+"#"+"\n");
                }
            else{
                    System.out.print("#".repeat(m)+"\n");
                }
        }
        sc.close();
    }
}