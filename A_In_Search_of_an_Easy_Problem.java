import java.util.Scanner;

public class A_In_Search_of_an_Easy_Problem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //String input = scanner.nextLine();
        String[]arr = scanner.nextLine().split(" "); //split by space
        Boolean res = false;
        scanner.close();
        
        for(String item : arr){
            if(item.equals("1")){
                res = true;
                break;
            }
        }
        
        System.out.println(res?"HARD":"EASY");
    }

}