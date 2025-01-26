import java.util.Scanner;

public class A_Police_Recruits {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Number of events
        int count = 0; // Number of untreated crimes
        int police = 0; // Number of available police officers

        for (int i = 0; i < n; i++) {
            int event = sc.nextInt();
            if (event > 0) {
                // Add police officers to the available pool
                police += event;
            } else {
                // Handle a crime (-1)
                if (police > 0) {
                    police--; // A police officer handles the crime
                } else {
                    count++; // Crime remains untreated
                }
            }
        }

        System.out.println(count); // Print the number of untreated crimes
        sc.close();
    }
}


/*public class A_Police_Recruits {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int count =0;
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0; i<n-1; i++){
            if(arr[i]>0){
                for(int j=i+1; j<i+arr[i]+1; j++){
                   arr[j]=0;
                }
            }
        }
        for(int i=0; i<n; i++){
            if(arr[i]==-1){
                count++;
            }
        }
        
        System.out.println(count);
        sc.close();
    }
}*/