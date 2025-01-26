import java.util.Scanner;

public class A_Marathon {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Number of test cases
        for (int i = 0; i < t; i++) {
            int count = 0; // Counter for numbers greater than arr[0]
            int reference = sc.nextInt(); // First number as the reference
            for (int j = 0; j < 3; j++) { // Compare the next 3 numbers
                if (sc.nextInt() > reference) {
                    count++;
                }
            }
            System.out.println(count); // Output the count
        }
        sc.close();
    }
}

/*import java.util.Scanner;

public class A_Marathon {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0; i<t; i++){
          int count=0;
          int[] arr = new int[4];
          for(int j=0; j<4;j++){
            arr[j]= sc.nextInt();
          }
          for(int k=1;k<4;k++){
            if(arr[k]>arr[0]){
             count++;
            }
          }
          System.out.println(count);
        }
        sc.close();
    }
}*/