import java.util.Scanner;

public class A_YES_or_YES {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for(int i=0; i<n; i++){
        String str = sc.nextLine().trim();
        if(str.equalsIgnoreCase("YES")){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
        }
        sc.close();
    }
}