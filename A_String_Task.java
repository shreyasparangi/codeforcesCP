import java.util.Scanner;

public class A_String_Task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toLowerCase();
        sc.close();
        StringBuilder result = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (isVowel(ch)) {
                continue;
            }
            result.append('.').append(ch);
        }
        System.out.println(result);
    }

    private static boolean isVowel(char ch) {
        return "aeiouy".indexOf(ch) != -1;
    }
}


/*import java.util.Scanner;

public class A_String_Task {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.toLowerCase();
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||
            str.charAt(i)=='u'){
                continue;
            }
            else{
                System.out.print("."+str.charAt(i));
            }
        }
        sc.close();
    }
}*/