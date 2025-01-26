import java.util.Scanner;

public class A_Polycarp_and_Coins {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            long n = sc.nextLong();
            long count1=0, count2=0;
            count1 = n/3;
            count2 = n/3;
            if(n%3==1){
                count1++;
            }
            else if(n%3==2){
                count2++;
            }
            
            System.out.println(count1+" "+count2);
        }
        sc.close();
    }
}