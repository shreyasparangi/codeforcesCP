import java.util.Scanner;

public class A_Linear_Keyboard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String keyboard = sc.next(); 
            String s = sc.next(); 
            int[] pos = new int[26]; 
            for (int i = 0; i < 26; i++) {
                pos[keyboard.charAt(i) - 'a'] = i;
            }
            int sum = 0;
            for (int i = 1; i < s.length(); i++) {
                sum += Math.abs(pos[s.charAt(i) - 'a'] - pos[s.charAt(i - 1) - 'a']);
            }

            System.out.println(sum);
        }
        sc.close();
    }
}
