import java.util.Scanner;

public class A_Division {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int j=0;j<t;j++){
            long num = sc.nextLong();
            if(num<=1399){
                System.out.println("Division 4");
            }
            else if(num<=1599){
                System.out.println("Division 3");
            }
            else if(num<=1899){
                System.out.println("Division 2");
            }
            else{
                System.out.println("Division 1");
            }
        }
        sc.close();
    }
}