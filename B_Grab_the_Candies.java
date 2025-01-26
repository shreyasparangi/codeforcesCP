import java.util.Scanner;

public class B_Grab_the_Candies {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int even = 0, odd = 0;
            for(int i = 0; i<n; i++){
                int num = sc.nextInt();
                if(num%2==0){
                    even += num;
                }
                else{
                    odd += num;
                }
            }
            System.out.println(even>odd?"YES":"NO");
        } 
        sc.close();   
    }
}