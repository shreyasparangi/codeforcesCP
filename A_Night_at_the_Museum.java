import java.util.Scanner;

public class A_Night_at_the_Museum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int rotations = 0;
        char current = 'a';
        for(int i=0; i<name.length(); i++){
            rotations += Math.min(26-(Math.abs(current-name.charAt(i))),
            (Math.abs(current-name.charAt(i))));
            current = name.charAt(i);
        }
        System.out.println(rotations);
        sc.close();
    }
}