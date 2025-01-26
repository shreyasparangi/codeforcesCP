import java.util.Scanner;

public class A_Even_Odds {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();
        
        long oddCount = (n+1)/2; 
        
        if (k <= oddCount) {
            System.out.println(2*k-1);  
        } else {
            System.out.println(2*(k-oddCount));  
        }
        
        sc.close();
    }
}
/*import java.util.Scanner;

public class A_Even_Odds {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int even = 2, odd = 1;
        int[] arr = new int[n];
        if(n%2==0){
            for(int i=0; i<n/2; i++){
                arr[i] = odd;
                odd += 2;
               }
           for(int i=n/2; i<n; i++){
              arr[i] = even;
              even+=2;
           }
           
        }
        else {
            for(int i=0; i<=n/2; i++){
                arr[i] = odd;
                odd += 2;
               }
           for(int i=(n/2)+1; i<n; i++){
              arr[i] = even;
              even+=2;
           }
        }
        System.out.println(arr[k-1]);
        sc.close();
    }
}*/