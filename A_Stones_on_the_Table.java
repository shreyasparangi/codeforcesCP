import java.util.Scanner;

public class A_Stones_on_the_Table {

    public static void main (String[] args) throws java.lang.Exception
	{
		// Input
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();

		// Counters
		int count = 0;
		char first = s.charAt(0);

		for (int i = 1; i < n; i++) {
			if (s.charAt(i) == first) count++;
			else first = s.charAt(i);
		}

		// Output
		System.out.println(count);
        sc.close();
	}
}