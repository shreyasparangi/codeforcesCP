import java.util.Scanner;

public class A_Love_Story {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        String og = "codeforces";
        while(t-->0){
            int count=0;
           String str = sc.nextLine();
           for(int i=0; i<str.length(); i++){
            if(str.charAt(i)!=og.charAt(i)){
                count++;
            }
           }
           System.out.println(count);
        }
        sc.close();
    }
}