import java.util.Scanner;

public class A_Insomnia_cure {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int punch = sc.nextInt();
        int tail = sc.nextInt();
        int paw = sc.nextInt();
        int call = sc.nextInt();
        int count = sc.nextInt();
        int damaged = 0;
        for(int i=1; i<=count;i++){
            if(i%punch==0 || i%tail==0||i%paw==0||i%call==0){
                damaged++;
            }
        }
        System.out.println(damaged);
        sc.close();
    }
}