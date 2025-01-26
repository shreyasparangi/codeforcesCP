import java.util.Scanner;

public class A_Soft_Drinking {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int friends = sc.nextInt();
        int bottles = sc.nextInt();
        int ml_per_bottle = sc.nextInt();
        int limes = sc.nextInt();
        int slices_per_lime = sc.nextInt();
        int salt = sc.nextInt();
        int req_ml_per_toast = sc.nextInt();
        int req_salt_per_toast = sc.nextInt();

        // Total available resources
        int total_ml = bottles * ml_per_bottle;
        int total_slices = limes * slices_per_lime;

        // Calculate how many toasts each resource can support
        int toasts_from_drink = total_ml / req_ml_per_toast;
        int toasts_from_slices = total_slices; // Each toast uses one slice
        int toasts_from_salt = salt / req_salt_per_toast;

        // Minimum of all resources determines the number of toasts
        int max_toasts = Math.min(toasts_from_drink, Math.min(toasts_from_slices, toasts_from_salt)) / friends;
        sc.close();
        System.out.println(max_toasts);
    }
}


/*public class A_Soft_Drinking {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int friends = sc.nextInt();
        int bottles = sc.nextInt();
        int ml = sc.nextInt();
        int lime = sc.nextInt();
        int slice = sc.nextInt();
        int salt = sc.nextInt();
        int req_ml = sc.nextInt();  //friends*ml
        int req_salt = sc.nextInt(); //friends*salt
        int tot_ml = bottles*ml;
        int[] toast = new int[3];
        toast[0]=tot_ml/friends;
        int tot_slices = lime*slice;
        toast[1]=tot_slices;
        toast[2]= salt;
        Arrays.sort(toast);
        System.out.println(toast[0]/friends);
    }
}*/