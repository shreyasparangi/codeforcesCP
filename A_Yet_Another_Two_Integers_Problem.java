import java.util.Scanner;

public class A_Yet_Another_Two_Integers_Problem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Number of test cases
        for (int j = 0; j < t; j++) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long diff = Math.abs(a - b); // Absolute difference between a and b
            long steps = diff / 10 + (diff % 10 > 0 ? 1 : 0); // Calculate steps
            System.out.println(steps);
        }
        sc.close();
    }
}

/*import java.util.Scanner;

public class A_Yet_Another_Two_Integers_Problem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] div = {10,9,8,7,6,5,4,3,2,1};
        for(int j=0; j<t; j++){
            long count=0;
            long a=sc.nextInt();
            long b=sc.nextInt();
            for(int i=0;i<10;i++){
                if(Math.abs(a-b)>=div[i]){
                    if(a>b){
                        a = a-div[i];
                        count++;
                    }
                    else if(a<b){
                        a = a+div[i];
                        count++;
                    }
                    else if(a==b){
                       break;
                    }
                }
            }
            System.out.println(count);
            
        }
        sc.close();
    }
}*/