import java.util.Scanner;

public class A_Creating_Words {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for(int i=0; i<t; i++){
            char temp;
            String str = sc.nextLine();
            char[] arr = str.toCharArray();
            temp = arr[0];
            arr[0] = arr[4];
            arr[4] = temp;
            String res = String.valueOf(arr);
            System.out.println(res);
        }
        sc.close();
    }
}