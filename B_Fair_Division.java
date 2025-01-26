import java.util.Scanner;

public class B_Fair_Division {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int count1 = 0, count2 = 0;
            for (int i = 0; i < n; i++) {
                int candy = sc.nextInt();
                if (candy == 1) count1++;
                else if (candy == 2) count2++;
            }
            if((count1+2*count2)%2!=0){
               System.out.println("NO");
            }
            else{
                int halfSum = (count1+2*count2)/2;
                if(halfSum%2==0||(halfSum%2==1&&count1>0)){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
            }
            
        }
        sc.close();
    }
}