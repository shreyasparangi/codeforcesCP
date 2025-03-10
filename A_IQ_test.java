import java.util.Scanner;

public class A_IQ_test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int even = 0, odd = 0, even_num_ind = 0, odd_num_ind = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 0) {
                even++;
                even_num_ind = i;
            } else {
                odd++;
                odd_num_ind = i;
            }
        }
        if(even>1){
            System.out.println(odd_num_ind+1);
        }
        else if(odd>1){
            System.out.println(even_num_ind+1);
        }
        sc.close();
    }
}