import java.util.Scanner;

public class A_Ultra_Fast_Mathematician {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String first = sc.nextLine();
        String second = sc.nextLine();
        StringBuilder res = new StringBuilder();
        for(int i=0; i<first.length(); i++){
            if(first.charAt(i)!=second.charAt(i)){
                res.append("1");
            }
            else{
                res.append("0");
            }
        }
            System.out.print(res);
        sc.close();
    }
}