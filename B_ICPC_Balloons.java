import java.util.HashSet;
import java.util.Scanner;

public class B_ICPC_Balloons {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
           //int n = sc.nextInt();
           int count=0;
           sc.nextLine();
           String str = sc.nextLine();
           HashSet<Character> set = new HashSet<>();
           for(char c: str.toCharArray()){
            if(set.contains(c)){
               count++;
            }
            else{
                count = count+2;
            }
               set.add(c);
           }
           System.out.println(count);
        }
        sc.close();
    }
}