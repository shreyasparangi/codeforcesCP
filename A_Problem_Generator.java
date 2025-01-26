import java.util.Scanner;

public class A_Problem_Generator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            String str = sc.next();
            int res = 0;
            char[] arr = str.toCharArray();
            int[] count = new int[7];
            for(int i=0; i<n; i++){
                count[arr[i]-'A']++;
            }
            for(int i=0; i<7; i++){
                if(count[i]<m){
                    res += m - count[i];
                }
            }
            System.out.println(res);
        }
        sc.close();
    }
}