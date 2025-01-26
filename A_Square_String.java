import java.util.Scanner;

public class A_Square_String {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String str = sc.nextLine();
            int len = str.length();
            String firstHalf = str.substring(0, len/2);
            String secondHalf = str.substring(len/2);
            if(firstHalf.equals(secondHalf)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        sc.close();
    }
}