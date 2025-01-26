import java.util.Scanner;

public class A_Legs {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int count = 0;
            while(n>0)
            if(n>=4){
                n -= 4;
                count++;
            }
            else{
                n -= 2;
                count++;
            }
            System.out.println(count);
        }
        sc.close();
    }
}
/*
 * import java.util.Scanner;

public class A_Legs {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            System.out.println((n + 3) / 4); // Efficient formula to minimize steps
        }
        sc.close();
    }
}

 */