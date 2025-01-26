import java.util.Scanner;

public class A_Arrival_of_the_General {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // number of soldiers
        int[] a = new int[n];  // array of soldier heights
        
        // Input soldier heights
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        
        // Find index of max and min heights
        int maxHeight = Integer.MIN_VALUE;
        int minHeight = Integer.MAX_VALUE;
        int maxIndex = -1;
        int minIndex = -1;
        
        // Find the first occurrence of max and the last occurrence of min
        for (int i = 0; i < n; i++) {
            if (a[i] > maxHeight) {
                maxHeight = a[i];
                maxIndex = i;
            }
            if (a[i] <= minHeight) {  // <= to ensure we get the last occurrence of min
                minHeight = a[i];
                minIndex = i;
            }
        }

        // Calculate swaps needed to move the max to the front
        int swaps = maxIndex;
        
        // Calculate swaps needed to move the min to the back
        swaps += (n - 1 - minIndex);
        
        // If the max comes after the min, we need to subtract one from the total swaps
        if (maxIndex > minIndex) {
            swaps--;
        }

        System.out.println(swaps);  // Output the result
        sc.close();
    }
}


/*import java.util.Scanner;

public class A_Arrival_of_the_General {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int t;
        int max =Integer.MIN_VALUE, min=Integer.MAX_VALUE, count=0;
        for(int i=0; i<a.length; i++){
            if(a[i]>max){
              max = a[i];
            }
            if(a[i]<min){
                min = a[i];
            }
        }
        for(int i=0; i<a.length; i++){
            if(a[i]==max){
                while(a[i]!=a[0]){
                    t=a[i];
                    a[i]=a[i-1];
                    a[i-1]=t;
                    count++;
                }
            }
            if(a[i]==min){
                while(a[i]!=a[a.length-1]){
                    t = a[i];
                    a[i] = a[i+1];
                    a[i+1]=t;
                    count++;
                }
            }
        }
        System.out.println(count);

    }
}*/