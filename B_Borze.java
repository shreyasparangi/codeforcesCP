import java.util.Scanner;

public class B_Borze {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine(); // Input Borze code
        StringBuilder result = new StringBuilder(); // To store decoded result

        for (int i = 0; i < str.length(); ) {
            if (str.charAt(i) == '.') {
                result.append("0");
                i++; // Move to the next character
            } else if (i + 1 < str.length() && str.charAt(i) == '-' && str.charAt(i + 1) == '.') {
                result.append("1");
                i += 2; // Skip two characters
            } else if (i + 1 < str.length() && str.charAt(i) == '-' && str.charAt(i + 1) == '-') {
                result.append("2");
                i += 2; // Skip two characters
            }
        }

        System.out.println(result.toString()); // Output the decoded result
        sc.close();
    }
}

/*import java.util.Scanner;

public class B_Borze {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] arr = str.toCharArray();
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]=='-'&&arr[i+1]=='.')
            {
                System.out.print("1");
                
            }
            else if(arr[i]=='-'&&arr[i+1]=='-'){
                System.out.print("2");
        
            }
            else if(arr[i]=='.')
            {
                System.out.print("0");
            }
        }
    }
}*/