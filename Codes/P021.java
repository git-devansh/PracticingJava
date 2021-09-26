
import java.util.*;
import java.lang.Boolean;

public class P021{
	
	public static void main(String args[] ) {
		Scanner scan = new Scanner(System.in);
		// <--- input from user 
		String s = scan.nextLine();
		// <--- input from user
		String[] arr = scan.nextLine().split(" ");
		
		int ar[] = new int[arr.length];
		int i;
		for(i = 0; i < arr.length; ++i) {
			ar[i] = Integer.parseInt(arr[i]);
		}
		
		System.out.println(s.substring(ar[0], ar[1]));
		
		scan.close();
	}
}