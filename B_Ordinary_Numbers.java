import java.util.Scanner;
public class B_Ordinary_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] ordinaryNumbers = {
            1, 2, 3, 4, 5, 6, 7, 8, 9,
            11, 22, 33, 44, 55, 66, 77, 88, 99,
            111, 222, 333, 444, 555, 666, 777, 888, 999,
            1111, 2222, 3333, 4444, 5555, 6666, 7777, 8888, 9999,
            11111, 22222, 33333, 44444, 55555, 66666, 77777, 88888, 99999,
            111111, 222222, 333333, 444444, 555555, 666666, 777777, 888888, 999999,
            1111111, 2222222, 3333333, 4444444, 5555555, 6666666, 7777777, 8888888, 9999999,
            11111111, 22222222, 33333333, 44444444, 55555555, 66666666, 77777777, 88888888, 99999999,
            111111111, 222222222, 333333333, 444444444, 555555555, 666666666, 777777777, 888888888, 999999999
        };
        while (t-- > 0) {
            int n = sc.nextInt();
            int count = 0;
            for (int num : ordinaryNumbers) {
                if (num <= n) {
                    count++;
                } else {
                    break; 
                }
            }
            System.out.println(count);
        }
        sc.close();
    }
}

/*import java.util.Scanner;
import java.util.ArrayList;

public class B_Ordinary_Numbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        // Precompute all ordinary numbers up to 10^9
        ArrayList<Integer> ordinaryNumbers = new ArrayList<>();
        for (int digit = 1; digit <= 9; digit++) {
            int num = digit;
            while (num <= 1_000_000_000) {  // Limit to 10^9
                ordinaryNumbers.add(num);
                num = num * 10 + digit;
            }
        }
        
        // Sort the list to enable binary search
        ordinaryNumbers.sort(null);

        while (t-- > 0) {
            int n = sc.nextInt();
            int count = 0;
            for (int num : ordinaryNumbers) {
                if (num <= n) {
                    count++;
                } else {
                    break;
                }
            }
            System.out.println(count-20);
        }
        sc.close();
    }
}*/

/*import java.util.Scanner;

public class B_Ordinary_Numbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int count = 0;
            for (int digit = 1; digit <= 9; digit++) {  // For digits 1 to 9
                int ordinary = digit;
                while (ordinary <= n) {
                    count++;
                    ordinary = ordinary * 10 + digit;  // Form numbers like 1, 11, 111...
                }
            }
            System.out.println(count);
        }
        sc.close();
    }
}*/

/*import java.util.Scanner;

public class B_Ordinary_Numbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
           int n = sc.nextInt();
           int digits = 0;
           while(n>0){
            n = n/10;
            digits++;
           }
           int ordinary = 9;
           if(n<10){
             System.out.println(n);
           }
           else{
                for(int i=1; i<n; i++){
                    if(i%11==0){
                        ordinary++;
                    }
                }
                System.out.println(ordinary);
           }

        }
        sc.close();
    }
}*/