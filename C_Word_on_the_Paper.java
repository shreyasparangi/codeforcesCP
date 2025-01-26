import java.util.Scanner;

public class C_Word_on_the_Paper {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
           StringBuilder join = new StringBuilder();
           for(int i=0; i<8; i++){
            String str = sc.next();
            for(char c: str.toCharArray()){
                if(Character.isLetter(c)){
                    join.append(c);
                }
            }
           }
           System.out.println(join.toString());
        }
        sc.close();
    }
}