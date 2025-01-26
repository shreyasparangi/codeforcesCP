import java.util.Scanner;

public class B_Drinks {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double conc=0;
        for(int i=0; i<n; i++){
            conc += (sc.nextDouble()/100); 
        }
        double res = (conc/n)*100;
        System.out.format("%.12f", res);
        sc.close();
    }
}