import java.util.Scanner;

public class B_Different_String {
    public static void solve(Scanner sc) {
        String s = sc.next();
        char[] arr = s.toCharArray();
        boolean ok = false;
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[0]) {
                char temp = arr[i];
                arr[i] = arr[0];
                arr[0] = temp;
                ok = true;
                break;
            }
        }
        
        if (!ok) {
            System.out.println("NO");
            return;
        }
        
        System.out.println("YES");
        System.out.println(new String(arr));
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tt = sc.nextInt();
        while (tt-- > 0) {
            solve(sc);
        }
        sc.close();
    }
}
 

/*import java.util.HashSet;
import java.util.Scanner;

public class B_Different_String {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            String str = sc.next();
            int len = str.length();
            char[] arr = str.toCharArray();
            HashSet<Character> set = new HashSet<>();
            for(char c: arr){
                set.add(c);
            }
            if(set.size()==1||set.size()==0){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
                System.out.println(new StringBuffer(str).reverse().toString());
            }
        }
        sc.close();
    }
}*/