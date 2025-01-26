import java.util.Scanner;

public class A_Word {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        int c1=0, c2=0;
        char [] arr = word.toCharArray();
        for(char c: arr){
           if(Character.isLowerCase(c)){
            c1++;
           }
           else if(Character.isUpperCase(c)){
            c2++;  
           }
        }
        if(c1>=c2){
            word = word.toLowerCase();
        }
        else if(c2>c1){
            word = word.toUpperCase();
        }
        System.out.println(word);
        sc.close();
    }
}