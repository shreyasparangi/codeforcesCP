import java.util.Scanner;

public class A_Free_Ice_Cream {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long x = sc.nextInt();
        long sad = 0;
        for(int i=0; i<n; i++){
            String sign = sc.next();
            long fluc = sc.nextInt();
            
            if(sign.equals("+")){
                x += fluc;
            }
            else if(sign.equals("-")){
                if(fluc>x){
                    sad++;
                }
                else{
                    x -= fluc;
                }
            }
        }
        System.out.println(x+" "+sad);
        sc.close();
    }
}