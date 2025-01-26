import java.util.Scanner;

public class A_Short_Sort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        String og = "abc";
        while(t-->0){
          String str = sc.nextLine();
          if(og.indexOf("a")==str.indexOf("a")||
          og.indexOf("b")==str.indexOf("b")||
          og.indexOf("c")==str.indexOf("c")){
            System.out.println("YES");
          }
          else{
            System.out.println("NO");
          }
        }
        sc.close();
    }
}