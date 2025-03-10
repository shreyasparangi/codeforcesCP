
import java.util.Scanner;

public class B_Taxi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] mp = new int[5]; 
       
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            mp[a]++;
        }   
        int ans = 0;
        ans += mp[4] + mp[3] + (mp[2] / 2);
        mp[1] = Math.max(0, mp[1] - mp[3]);

        if (mp[2] % 2 == 1) {
            ans++;
            mp[1] = Math.max(0, mp[1] - 2);
        }
        ans += (mp[1] + 3) / 4; 

        System.out.println(ans);
        sc.close();
    }
}
 