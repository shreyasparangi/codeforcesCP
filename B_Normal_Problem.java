import java.util.Scanner;

public class B_Normal_Problem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            String s = sc.next();
            for(int i=s.length()-1; i>=0; i--){
                if(s.charAt(i)=='p'){
                    System.out.print("q");
                }
                else if(s.charAt(i)=='q'){
                    System.out.print("p");
                }
                else if(s.charAt(i)=='w'){
                    System.out.print("w");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}