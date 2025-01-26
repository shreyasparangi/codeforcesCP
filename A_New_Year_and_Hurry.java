import java.util.Scanner;

public class A_New_Year_and_Hurry {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int time = sc.nextInt();
        int total= 240;
        int count =0;
        for(int i=1; i<=n; i++){
            time +=5*i;
            if(total>=time){
                count++;
            }
            else{
                break;
            }
        }
        System.out.println(count);
        sc.close();
    }
}