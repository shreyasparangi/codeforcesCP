import java.util.Scanner;

public class A_Next_Round {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count  = 0;
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n;i++){
            arr[i]= sc.nextInt();
        }
        for(int i=0; i<n; i++){
            
            if(arr[i]>=arr[k-1] && arr[i]>0){
                count++;
            }
            else{
            break;}
        }
        System.out.println(count);
        sc.close();
    }
}