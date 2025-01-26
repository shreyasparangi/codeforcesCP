import java.util.Scanner;

public class A_Anton_and_Danik {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int n = sc.nextInt();
        sc.nextLine();
        int c1=0, c2=0;
        String game = sc.nextLine();
        char[] arr = game.toCharArray();
        for(char c: arr){
            if(c=='A'){
                c1++;
            }
            else if(c=='D'){
                c2++;
            }
        }
        if(c1>c2){
            System.out.println("Anton");
        }
        else if(c1<c2){
            System.out.println("Danik");
        }
        else if(c1==c2){
            System.out.println("Friendship");
        }
        sc.close();
    }
}