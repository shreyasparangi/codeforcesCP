import java.util.Scanner;

public class A_Lucky {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for(int j=0;j<t;j++){
            String str = sc.nextLine();
            int sum1=0,sum2=0;
            for(int i=0;i<6;i++){
                int digit = Character.getNumericValue(str.charAt(i));
                if(i<3){
                sum1 += digit;
                }
                else{
                sum2 += digit;
                }
            }
            if(sum1==sum2){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        sc.close();
    }
}