import java.util.HashMap;
import java.util.Scanner;

public class B_Triple {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            HashMap<Integer, Integer> freq = new HashMap<>();
            int result = -1;
            
            for (int i = 0; i < n; i++) {
                int num = sc.nextInt();
                freq.put(num, freq.getOrDefault(num, 0) + 1);
                
                if (freq.get(num) == 3) {
                    result = num;
                }
            }
            
            System.out.println(result);
        }
        
        sc.close();
    }
}
