import java.util.Scanner;

public class B_Colourblindness {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            sc.nextLine();
            String a = sc.nextLine();
            String b = sc.nextLine();
            boolean correct = true;
            for(int i=0; i<n; i++){
                if(!(a.charAt(i)==b.charAt(i)||(a.charAt(i)=='G'&&b.charAt(i)=='B')||
                (a.charAt(i)=='B'&&b.charAt(i)=='G'))){
                    correct = false;
                    break;
                }
            }
            if(correct){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        sc.close();
    }
}