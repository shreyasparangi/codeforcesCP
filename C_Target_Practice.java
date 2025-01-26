import java.util.Scanner;

public class C_Target_Practice {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int points = 0;
            for(int i=0; i<10; i++){
                String str = sc.next();
                for(int j=0; j<10; j++){
                    if(str.charAt(j)=='X'){
                        int rowDist = Math.min(i + 1, 10 - i);
                        int colDist = Math.min(j + 1, 10 - j);
                        points += Math.min(rowDist, colDist);
                    }
                }
            }
            System.out.println(points);
        }
        sc.close();
    }
}