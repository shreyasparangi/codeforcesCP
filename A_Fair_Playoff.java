import java.util.Scanner;

public class A_Fair_Playoff {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int s1 = sc.nextInt();
            int s2 = sc.nextInt();
            int s3 = sc.nextInt();
            int s4 = sc.nextInt();
            int max12 = Math.max(s1, s2);
            int max34 = Math.max(s3, s4);
            if(max12<Math.min(s3, s4)||max34<Math.min(s1, s2)){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }
        }
        sc.close();
    }
}