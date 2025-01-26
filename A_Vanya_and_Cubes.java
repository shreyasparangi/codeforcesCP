import java.util.Scanner;

public class A_Vanya_and_Cubes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = 0,count=0;
        int i = 1;
        while (res + (i * (i + 1)) / 2 <= n) {  
            res += (i * (i + 1)) / 2;  
            count++;  
            i++;  
        }
        System.out.println(count);
        sc.close();
    }
}