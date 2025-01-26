import java.util.Scanner;

public class A_Sereja_and_Dima {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        int left=0;
        int right=n-1;
        int sereja=0, dima=0;
        boolean serejaturn=true;
        while(left<=right){
            if(arr[left]>=arr[right]){
               if(serejaturn){
                sereja+=arr[left];
               }
               else{
                dima += arr[left];
               }
               left++;
            }
            else
            {
                if(serejaturn){
                    sereja+=arr[right];
                }
                else{
                    dima+=arr[right];
                }
                right--;
            }
            serejaturn = !serejaturn;
        }
        System.out.println(sereja+" "+dima);
        
        sc.close();
    }
}