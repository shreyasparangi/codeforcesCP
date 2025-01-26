import java.util.Scanner;

public class A_Odd_Set {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int even = 0, odd = 0;
            for(int i=0; i<2*n;i++){
                if(sc.nextInt()%2==0){
                    even++;
                }
                else
                {
                    odd++;
                }
            }
            System.out.println(even==odd? "Yes": "No");
        }
        sc.close();
    }
}