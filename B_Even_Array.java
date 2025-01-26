import java.util.Scanner;

public class B_Even_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        while (t-- > 0) {
            int n = sc.nextInt();  
            int[] arr = new int[n];
            int oddAtEven = 0;  
            int evenAtOdd = 0;  
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                if (i % 2 == 0 && arr[i] % 2 != 0) {
                    oddAtEven++;  
                } else if (i % 2 != 0 && arr[i] % 2 == 0) {
                    evenAtOdd++; 
                }
            }
            if (oddAtEven == evenAtOdd) {
                System.out.println(oddAtEven);
            } else {
                System.out.println("-1");
            }
        }
        sc.close();
    }
}


/*import java.util.Scanner;

public class B_Even_Array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
           int n = sc.nextInt();
           int[] arr = new int[n];
           int count=0;
           for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
           }
           for(int i=0; i<n; i++){
            if(i%2!=arr[i]%2){
               count++;
            }
           }
           if(arr.length<2){
            System.out.println("-1");
           }
           else{
            System.out.println(count);
           }
        }
        sc.close();
    }
}*/