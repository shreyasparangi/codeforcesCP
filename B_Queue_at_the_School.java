import java.util.Scanner;

public class B_Queue_at_the_School {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        sc.nextLine();
        String og = sc.nextLine();
        char temp;
        for(int i = 0; i<k; i++){
            char[] arr1 = og.toCharArray();
            for(int j = 0; j<n-1; j++){
                if(arr1[j]=='B' && arr1[j+1]=='G'){
                    temp = arr1[j];
                    arr1[j] = arr1[j+1];
                    arr1[j+1]= temp;
                    j++;
                }
            }
            og = String.copyValueOf(arr1);            
        }
        System.out.println(og);
        sc.close();
    }
}