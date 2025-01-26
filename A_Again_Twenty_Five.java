import java.util.Scanner;

public class A_Again_Twenty_Five {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //long n = sc.nextLong(); // Use long for large input values
        System.out.println(25); // The last two digits for any n >= 2
        sc.close();
    }
}


/*import java.util.Scanner;

public class A_Again_Twenty_Five {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextInt();
        int res =(int) Math.pow(5, n);
        res = res%100;
        System.out.println(res);
        sc.close();
    }
}*/