import java.util.Scanner;

public class A_Games {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count =0;
        int[][] teams = new int[n][2];
        for(int i=0; i<n; i++){
            teams[i][0]= sc.nextInt();
            teams[i][1]= sc.nextInt();
        }
        for(int i=0; i<n; i++){
            for(int j =0; j<n; j++){
              if(teams[i][0]==teams[j][1]){
                count++;
              }
            }
        }
        System.out.println(count);
        sc.close();
    }
}
/*public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int numofgames=0;
        int n=in.nextInt();
        int[] x =new int[n];  
                int[] y =new int[n];  
  for(int i=0;i<n;i++){
{
x[i]=in.nextInt();  y[i]=in.nextInt();
}}
  for(int i=0;i<n;i++){
  for(int h=0;h<n;h++){
if(x[i]==y[h])
    numofgames++;
}
}
  System.out.println(numofgames);
  }    */