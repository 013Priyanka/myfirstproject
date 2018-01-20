package src;
import java.lang.*;
import java.util.*;
public class ReverseString 
{
	public static void main(String[] args)
	    {
		Scanner in = new Scanner(System.in);
		 
	      System.out.print("Enter the your string=");
	      String s1 = in.nextLine();
	 
	        char[] c = s1.toCharArray();
	        System.out.print("reverser string id=");
	 	   for (int i = c.length-1; i>=0; i--)
	            System.out.print(c[i]);
	    }
	}
