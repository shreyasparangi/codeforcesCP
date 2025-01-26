/*import java.util.Scanner;

public class A_Perfect_Permutation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%2!=0){
            System.out.println(-1);
        }
        else{
        int[] arr = new int[n];
        int temp = 0;
        for(int i=0; i<n; i++){
            arr[i] = i+1;
        }
        for(int i=0; i<n-1; i+=2){
            temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
    sc.close();
    }
}*/


 import java.util.Scanner;

public class A_Perfect_Permutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        if (n % 2 == 1) {
            System.out.println(-1);
        } else {
            for (int i = 1; i <= n; i += 2) {
                System.out.print((i + 1) + " " + i + " ");
            }
        }
        
        sc.close();
    }
}

