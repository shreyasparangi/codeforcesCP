import java.util.*;

public class B_Ten_Words_of_Wisdom {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
           int n = sc.nextInt();
           int max = 0;
           int winner = 0;
           int[][] arr = new int[n][2];
           for(int i=0; i<n; i++){
                arr[i][0] = sc.nextInt();
                arr[i][1] = sc.nextInt();
           }
            for(int i=0; i<n; i++){
                if(arr[i][0]<=10 && arr[i][1]>max){
                    max = arr[i][1];
                    winner = i+1;
                }
            }
            System.out.println(winner);
        }
        sc.close();
    }
}