import java.util.Scanner;

public class A_Primary_Task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int a = sc.nextInt();
            if (102 <= a && a<= 109 || 1010 <= a && a<= 1099)
                System.out.println("YES");
            else
                System.out.println("NO");
        
        }
        
        sc.close();
    }
}

/*import java.util.Scanner;

public class A_Primary_Task {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int a = sc.nextInt();
            if(a>1000){
                if(a/100==10&&((a%10>=2)&&(a%100>=10)||(a%100==10))){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
            }
            else if(a<1000){
                if(a/10==10&&(a%10>=2)){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
            }
            else{
                System.out.println("NO");
            }
        }
        sc.close();
    }
}*/