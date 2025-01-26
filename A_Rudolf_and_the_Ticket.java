import java.util.Scanner;

public class A_Rudolf_and_the_Ticket {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt();
            int count = 0;
            int[] b = new int[n];
            int[] c = new int[m];
            for(int i=0; i<n; i++){
                b[i] = sc.nextInt();
            }
            for(int i=0; i<m; i++){
                c[i] = sc.nextInt();
            }
            for(int i=0; i<n; i++){
                for(int j=0; j<m;j++){
                    if(b[i]+c[j]<=k){
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
        sc.close();
    }
}
/*
 * import java.util.Arrays;
import java.util.Scanner;

public class A_Rudolf_and_the_Ticket {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt();
            int[] b = new int[n];
            int[] c = new int[m];
            
            for (int i = 0; i < n; i++) {
                b[i] = sc.nextInt();
            }
            for (int i = 0; i < m; i++) {
                c[i] = sc.nextInt();
            }
            
            Arrays.sort(c);
            int count = 0;
            
            for (int i = 0; i < n; i++) {
                int target = k - b[i];
                int index = upperBound(c, target);
                count += index;
            }
            
            System.out.println(count);
        }
        
        sc.close();
    }

    // Binary search for upper bound
    private static int upperBound(int[] arr, int target) {
        int low = 0, high = arr.length;
        while (low < high) {
            int mid = (low + high) / 2;
            if (arr[mid] <= target) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }
}

 */