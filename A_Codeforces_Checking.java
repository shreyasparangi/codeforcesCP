import java.util.Scanner;

public class A_Codeforces_Checking {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String str = "codeforces";
        for(int j=0;j<t;j++){
            char c = sc.next().charAt(0);
            if(str.indexOf(c)!=-1){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
