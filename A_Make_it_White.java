import java.util.Scanner;

public class A_Make_it_White {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            String str = sc.next();
            int first =-1,last=-1;
            for(int i=0; i<n; i++){
               if(str.charAt(i)=='B'){
                if(first==-1){
                    first = i;
                }
                last = i;
               }
            }
            System.out.println(first == -1 ? 0 : last - first + 1);
        }
        sc.close();
    }
}