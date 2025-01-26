import java.util.Scanner;

public class A_Boring_Apartments {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int count=0;
            int num = sc.nextInt();
            int temp = num;
            int sum=0;
            for(int i=1;i<num%10; i++){
               sum+= 1+2+3+4;
            }
            while(temp!=0){
              temp=temp/10;
              count++;
            }
            if(count==1){
                sum+=1;
            }
            else if(count==2){
                sum+=1+2;
            }
            else if(count==3){
                sum+=1+2+3;
            }
            else if(count==4){
                sum+=1+2+3+4;
            }
            
            System.out.println(sum);
        }
        sc.close();
    }
}