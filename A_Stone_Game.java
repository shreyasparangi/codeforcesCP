import java.util.Scanner;

public class A_Stone_Game {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            int max = 0, min = Integer.MAX_VALUE;
            int[] powers =  new int[n];
            for(int i=0; i<n; i++){
                powers[i] = sc.nextInt();
                max = Math.max(max, powers[i]);
                min = Math.min(min, powers[i]);
            }
            int maxIndex = 0, minIndex = 0;
            for(int i=0; i<n; i++){
                if(powers[i] == max) maxIndex = i;
                if(powers[i] == min) minIndex = i;
            }
             int leftMax = maxIndex + 1;
             int leftMin = minIndex + 1;
             int rightMax = n - maxIndex;
             int rightMin = n - minIndex;
             int case1 = Math.max(leftMax, leftMin);
             int case2 = Math.max(rightMax, rightMin);
             int case3 = Math.min(leftMax + rightMin, leftMin + rightMax);
             System.out.println(Math.min(case1, Math.min(case2, case3)));
        }
        sc.close();
    }
}