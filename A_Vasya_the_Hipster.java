import java.util.Scanner;

public class A_Vasya_the_Hipster {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // Number of red socks
        int b = sc.nextInt(); // Number of blue socks

        // Days wearing different socks
        int count1 = Math.min(a, b);

        // Remaining socks after wearing different ones
        int remaining = Math.abs(a - b);

        // Days wearing same socks from remaining
        int count2 = remaining / 2;

        System.out.println(count1 + " " + count2);
        sc.close();
    }
}


/*import java.util.Scanner;

public class A_Vasya_the_Hipster {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b= sc.nextInt();
        int count2=0,count1=0;
        while(a>0||b>0){
            if(a==0&&b>1){
                b = b-2;
                count2++;
            }
            else if(a>1&&b==0){
                a = a-2;
                count2++;
            }
            else if(a>0&&b>0){
                a--;
                b--;
                count1++;
            }
        }
        System.out.println(count1+" "+count2);
        sc.close();
    }
}*/