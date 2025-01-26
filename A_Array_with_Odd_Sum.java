import java.util.Scanner;

public class A_Array_with_Odd_Sum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int sum = 0;
            boolean odd = false, even = false;
            for(int i=0; i<n; i++){
                int x = sc.nextInt();
                sum += x;
                odd |= x%2!=0;
                even |= x%2 == 0;
            }
            if (sum % 2 != 0 || (odd && even)) 
            System.out.println("YES");
		    else 
            System.out.println("NO");
        }
        sc.close();
    }
}