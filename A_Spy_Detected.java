import java.util.Scanner;

public class A_Spy_Detected {

    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int j=0; j<t; j++){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0; i<n;i++){
                arr[i]=sc.nextInt();
            }
            int pos=-1;
            if(arr[0]!=arr[1]&&arr[0]!=arr[2]){
                pos=1;
            }
            else{
                for(int i=1;i<n;i++){
                    if(arr[i]!=arr[0]){
                        pos = i+1;
                        break;
                    }
                }
            }
            System.out.println(pos);
        }
        sc.close();
    }
}