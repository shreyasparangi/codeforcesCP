import java.util.Scanner;

public class A_Divisibility_Problem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            // Calculate how much we need to add to make 'a' divisible by 'b'
            int remainder = a % b;
            int increment = (remainder == 0) ? 0 : b - remainder;
            System.out.println(increment);
        }
        sc.close();
    }
}
/*import java.util.Scanner;

public class A_Divisibility_Problem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] count = new int[n];
        int[][] a = new int[n][2];
        for(int i=0; i<n; i++){
            a[i][0]= sc.nextInt();
            a[i][1]= sc.nextInt();
        }
        for(int i=0; i<n; i++){
            while(a[i][0]%a[i][1]!=0){
                a[i][0]++;
                count[i]++;
            }
            System.out.println(count[i]);
        }
        sc.close();
    }
}*/