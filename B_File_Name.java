import java.util.Scanner;

public class B_File_Name {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = "xxx";
        String filename = sc.next();
        int count = 0;
        for(int i=0; i<=n-3; i++){
            if(filename.substring(i, i+3).equals(s)){
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}