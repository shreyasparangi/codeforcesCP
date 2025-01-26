import java.util.HashSet;
import java.util.Scanner;

public class A_Do_Not_Be_Distracted {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            //int n = sc.nextInt();
            sc.nextLine();
            String str = sc.nextLine();
            boolean flag = false;
            HashSet<Character> seen = new HashSet<>();
            char last = '\0';
            for(char c: str.toCharArray()){
                if(c!=last){
                    if(seen.contains(c)){
                        flag = true;
                    }
                    seen.add(last);
                    last = c;
                }
            }
            if(flag){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }
        }
        sc.close();
    }
}