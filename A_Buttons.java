import java.util.Scanner;

public class A_Buttons {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            System.out.println((a + (c % 2) > b) ? "First" : "Second");  
        }
        sc.close();
    }
}

/*import java.util.Scanner;

public class A_Buttons {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int n = a+b+c;
            if(a>b||(a<=b && n%2!=0)){
                System.out.println("First");
            }
            else{
                System.out.println("Second");
            }

        }
        sc.close();
    }
}*/