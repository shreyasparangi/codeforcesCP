import java.util.Scanner;

public class B_Following_Directions {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int t = sc.nextInt();
       while(t-->0){
          int n = sc.nextInt();
          String str = sc.next();
          int x = 0, y = 0;
          boolean passes =  false;
          for(int i =0; i<n; i++){
            if(str.charAt(i)=='U'){
                y++;
            }
            else if(str.charAt(i)=='D'){
                y--;
            }
            else if(str.charAt(i)=='R'){
                x++;
            }
            else if(str.charAt(i)=='L'){
                x--;
            }
            if(x==1&&y==1){
                passes = true;
                break;
            }
          }
          System.out.println(passes? "YES": "NO");
       }
       sc.close();
    }
}