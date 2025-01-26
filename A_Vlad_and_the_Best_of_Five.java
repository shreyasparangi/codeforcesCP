import java.util.Scanner;

public class A_Vlad_and_the_Best_of_Five {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String str = sc.nextLine();
            long countA = str.chars().filter(ch -> ch == 'A').count();
            long countB = str.length() - countA; 
            System.out.println(countA>countB? "A": "B");
        }
        sc.close();
    }
}