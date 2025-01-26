import java.util.Scanner;

public class A_Panoramix_s_Prediction {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int nextPrime = findNextPrime(x);
        if (nextPrime == y) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        sc.close();
    }
    public static int findNextPrime(int n) {
        int candidate = n + 1;
        while (!isPrime(candidate)) {
            candidate++;
        }
        return candidate;
    }
    public static boolean isPrime(int n) {
        if (n <= 1) 
        return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) 
            return false;
        }
        return true;
    }
}


/*import java.util.Scanner;

public class A_Panoramix_s_Prediction {

    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47};
        int x = sc.nextInt();
        int y =sc.nextInt();
        for(int index = 0 ;index <arr.length-1;index++)
        {
            if(arr[index] == x && arr[index+1] ==y)
            {
                System.out.println("YES");
                return;
            }

        }
        System.out.println("NO");
        sc.close();
    }
}*/