import java.util.Scanner;

public class B_Not_Quite_Latin_Square {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            char ans = '\0';
            for(int i=0; i<3; i++){
                String str = sc.next();
                for(int j=0; j<3; j++){
                    if(str.charAt(j)=='?'){
                        if(str.contains("A")&&str.contains("B")){
                            ans = 'C';
                        }
                        else if(str.contains("B")&&str.contains("C")){
                            ans = 'A';
                        }
                        else if(str.contains("A")&&str.contains("C")){
                            ans = 'B';
                        }
                    }
                }
            }
            System.out.println(ans);
        }
        sc.close();
    }
}