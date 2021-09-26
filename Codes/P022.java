import java.util.*;

public class P022 {
	
	public static String getSmallestAndLargest(String s, int k) {
		String currentVal = s.substring(0, k);
        String smallest = currentVal;
        String largest = currentVal;
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        for(int i = 1; i <= s.length() - k; ++i) {
        	currentVal = s.substring(i, i+k);
        	
        	if(currentVal.compareTo(largest) > 0) {
        		largest = currentVal;
        	}
        	
        	if(currentVal.compareTo(smallest) < 0) {
        		smallest = currentVal;
        	}
        }
        
        //for(String i: list) System.out.println(i);
        
        
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}