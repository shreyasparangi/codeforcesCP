import java.util.Arrays;
import java.util.Scanner;

public class A_Medium_Number {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int j=0; j<t; j++){
            int[] arr= new int[3];
            for(int i=0; i<3;i++){
                arr[i]=sc.nextInt();
            }
            Arrays.sort(arr);
            System.out.println(arr[1]);
        }
        sc.close();
    }
}