import java.util.Scanner;

public class A_Maximum_in_Table {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[][] table = new int[n][n];
        for(int i=0; i<n; i++){
            table[0][i] = 1;
            table[i][0] = 1;
        }
        for(int i=1; i<n; i++){
            for(int j=1; j<n; j++){
                table[i][j] = table[i-1][j] + table[i][j-1];
            }
        }
        
        System.out.println(table[n-1][n-1]);
        sc.close();
    }
}