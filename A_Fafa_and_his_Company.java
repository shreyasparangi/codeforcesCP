import java.util.Scanner;

public class A_Fafa_and_his_Company {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count =0;
        for(int i=1; i<n; i++){
            if(n%i==0){        //i*((n-i)/i)+i==n
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}