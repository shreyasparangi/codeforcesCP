import java.util.Scanner;

public class A_Buy_a_Shovel {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cost = sc.nextInt();
        int change = sc.nextInt();
        int count =1;
        while(true){
            int tot = cost*count;
            if(tot%10==0||tot%10==change){
                System.out.println(count);
                break;
            }
            count++;
        }
        sc.close();
    }
}