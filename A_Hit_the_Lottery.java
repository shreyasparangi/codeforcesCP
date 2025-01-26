import java.util.Scanner;

public class A_Hit_the_Lottery {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] bills = {100,20,10,5,1};
        int n = sc.nextInt();
        int count =0;
        for(int bill: bills){
            if(n>=bill){
                count+=n/bill;
                n = n%bill;
            }
        }
        System.out.println(count);
        sc.close();
    }
}

/*public class A_Hit_the_Lottery {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int n = sc.nextInt();
        while (n!=0) {
            if(n>=100){
                count += (n/100);
                n = n%100;
            }
            else if(n>=20){
                count += n/20;
               n = n%20;
            }
            else if(n>=10){
                count+=n/10;
                n = n%10;
            }
            else if(n>=5){
                count+=n/5;
                n = n%5;
            }
            else{
                count+=n/1;
                n = n%1;
            }
        }
        System.out.println(count);
        sc.close();
    }
}*/