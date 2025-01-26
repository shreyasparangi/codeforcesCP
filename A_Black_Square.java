import java.util.Scanner;

public class A_Black_Square {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] cals = new int[4];
        for(int i=0; i<4; i++){
            cals[i]=sc.nextInt();
        }
        int total=0;
        sc.nextLine();
        String str = sc.nextLine();
        for(char c: str.toCharArray()){
            total += cals[c - '1'];
        }
        System.out.println(total);
        sc.close();
    }
}