import java.util.Arrays;
import java.util.Scanner;

public class A_Spell_Check {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
          int n = sc.nextInt();
          sc.nextLine();
          String str = sc.nextLine();
          String og = "Timur";
          char[] given = str.toCharArray();
          char[] ori = og.toCharArray();
          Arrays.sort(given);
          Arrays.sort(ori);
          if(n==5&&Arrays.equals(given, ori)){
            System.out.println("YES");
          }
          else{
            System.out.println("NO");
          }
        }
        sc.close();
    }
}