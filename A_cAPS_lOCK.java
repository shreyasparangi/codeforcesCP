import java.util.Scanner;

public class A_cAPS_lOCK {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next(); 
        sc.close();
        boolean change = true;
        for(int i=1; i<s.length(); i++){
            if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z'){
                change = false;
                break;
            }
        }
        if(change){
            StringBuilder result = new StringBuilder();
            for(int i=0; i<s.length(); i++){
                char ch = s.charAt(i);
                if(ch >= 'a' && ch <= 'z'){
                    result.append((char)(ch - ('a' - 'A')));
                }else{
                    result.append((char)(ch + ('a' - 'A')));
                }
            }
            System.out.println(result.toString());
        }else{
            System.out.println(s);
        }
    }
}
