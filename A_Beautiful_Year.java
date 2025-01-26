import java.util.HashSet;
import java.util.Scanner;
public class A_Beautiful_Year {

    public static void main (String[] args) throws java.lang.Exception
	{
		// Input
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
        sc.close();
		while (true) {
			year++;
			if (checkDistinct(Integer.toString(year))) {
				System.out.println(year);
				return;	
			}
		}
        
	}

	public static Boolean checkDistinct(String d) {
		int d1 = Character.getNumericValue(d.charAt(0));
		int d2 = Character.getNumericValue(d.charAt(1));
		int d3 = Character.getNumericValue(d.charAt(2));
		int d4 = Character.getNumericValue(d.charAt(3));

		HashSet<Integer> set = new HashSet<Integer>();
		set.add(d1);
		set.add(d2);
		set.add(d3);
		set.add(d4);

		return set.size() == 4;
	}	
    
}