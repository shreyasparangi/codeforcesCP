import java.util.Scanner;

public class A_Short_Substrings {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for(int i=0; i<t; i++){
            String str = sc.nextLine();
            char[] arr = str.toCharArray();
            if(str.length()>2){
            System.out.print(arr[0]);
            for(int j=1; j<arr.length-2; j=j+2){
                System.out.print(arr[j]);
            }
            System.out.print(arr[arr.length-1]);
            System.out.println();
        }
        else{
            System.out.println(str);
        }
        }
        sc.close();
    }
}
