import java.util.Scanner;

public class A_Pangram {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int n = sc.nextInt();
        sc.nextLine();
        boolean flag = true;
        String str = sc.nextLine();
        for(char c = 'a'; c<='z'; c++){
            if(!str.toLowerCase().contains(String.valueOf(c)))
            {
                flag = false;
                break;
            }  
        }
        if(flag){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
        sc.close();
    }
}