import java.util.Scanner;

public class C_Prepend_and_Append {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            sc.nextLine();
            String str = sc.nextLine();
            int length = n;
            int i = 0, j = n-1;
            while(i<j){
                if(str.charAt(i)!=str.charAt(j)){
                    length -= 2;
                }
                else{
                    break;
                }
                i++;
                j--;
            }
            System.out.println(length);
        }
        sc.close();
    }
}