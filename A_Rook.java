import java.util.Scanner;

public class A_Rook {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            String s = sc.next();
            String cols = "abcdefgh";
            char[] colsarr = cols.toCharArray();
            char col = s.charAt(0);
            int row = s.charAt(1) - '0';
            for(int i=1; i<=8; i++){
                if(colsarr[i-1]==col){
                    continue;
                }
                System.out.println(colsarr[i-1]+""+row);
            }
            for(int i=1; i<=8; i++){
                if(i==row){
                    continue;
                }
                System.out.println(col+""+i);
            }
        }
        sc.close();
    }
}