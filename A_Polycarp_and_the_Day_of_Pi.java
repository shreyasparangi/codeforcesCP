import java.util.Scanner;

public class A_Polycarp_and_the_Day_of_Pi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            String seq = sc.next();
            String pi = "31415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679";
            int n = Math.min(seq.length(), pi.length());
            char[] piArr = pi.toCharArray();
            char[] seqArr = seq.toCharArray();
            int matchCount = 0;
            for(int i=0; i<n; i++){
                if(piArr[i] != seqArr[i]){
                    break;
                }
                matchCount++;
            }
            System.out.println(matchCount);         
        }
        sc.close();
    }
}
