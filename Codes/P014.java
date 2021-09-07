import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class P014 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int count = 1;
        while(scan.hasNext()) {
            String n = scan.nextLine();
            System.out.println(count + " " + n);
	    count++;
        }
        
        scan.close();
        
        
    }
}