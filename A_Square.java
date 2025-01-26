import java.util.Arrays;
import java.util.Scanner;

public class A_Square {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
           int[][] arr = new int[4][2];
           for(int i=0; i<4; i++){
            for(int j=0; j<2; j++){
                arr[i][j] = sc.nextInt();
            }
           }
           Arrays.sort(arr, (a,b)-> Integer.compare(a[0], b[0]));
           int yi = Math.abs(arr[0][1]-arr[1][1]);
           System.out.println(yi*yi); 
        }
        sc.close();
    }
}
/* Sorting 2d array 
 * Arrays.sort(contests, (a, b) ->
Integer.compare(a[0],b[0]));//increasing order     ---1

Arrays.sort(contests, (b, a) ->
Integer.compare(b[0],a[0]));//increasing order     ---2

Arrays.sort(contests, (a, b) ->
Integer.compare(b[0],a[0]));//decreasing order     ---3

Arrays.sort(contests, (b, a) ->
Integer.compare(a[0],b[0]));//decreasing order     ---4
 */