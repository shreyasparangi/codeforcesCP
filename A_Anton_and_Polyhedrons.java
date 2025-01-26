import java.util.Scanner;
public class A_Anton_and_Polyhedrons {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); // Consume the newline character
        int count = 0;

        for (int i = 0; i < n; i++) {
            String shape = sc.nextLine();
            switch (shape) {
                case "Tetrahedron" -> count += 4;
                case "Cube" -> count += 6;
                case "Octahedron" -> count += 8;
                case "Dodecahedron" -> count += 12;
                case "Icosahedron" -> count += 20;
            }
        }

        System.out.println(count);
        sc.close();
    }
}


/*public class A_Anton_and_Polyhedrons {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int count = 0;
        String[] shapes = new String[n];
        for(int i=0; i<n; i++){
            shapes[i]= sc.nextLine();
        }
        for(String str: shapes){
            if(str.compareTo("Tetrahedron")==0){
               count+= 4;
            }
            else if(str.compareTo("Cube")==0){
                count+=6;
            }
            else if(str.compareTo("Octahedron")==0){
                count+=8;
            }
            else if(str.compareTo("Dodecahedron")==0){
                count+=12;
            }
            else if(str.compareTo("Icosahedron")==0){
                count+=20;
            }
        }
        System.out.println(count);
        sc.close();
        
    }
}*/