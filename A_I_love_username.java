import java.util.Scanner;

public class A_I_love_username {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] points = new int[n];
        for(int i=0; i<n; i++){
            points[i]=sc.nextInt();
        }
        int best = points[0];
        int worst = points[0];
        int amaz = 0;
        for(int i=1; i<n; i++){
            if(points[i]>best){
                amaz++;
                best = points[i];
            }
            else if(points[i]<worst){
                amaz++;
                worst = points[i];
            }
        }
        System.out.println(amaz);
        sc.close();
    }
}