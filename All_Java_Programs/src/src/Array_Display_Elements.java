package src;
import java.util.Scanner;
public class Array_Display_Elements 
{
	public static void main(String[] args) 
	    {
	        int n;
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter no. of elements you want in array:");
	        n = s.nextInt();
	        int a[] = new int[n];
	        System.out.println("Enter all the elements:");
	        for (int i = 0; i < n; i++) 
	        {
	            a[i] = s.nextInt();
	        }
	        System.out.println("the elements of array are:");
	        for(int i=0;i<n;i++)
	        {
	        	System.out.println(a[i]);
	        }
}
}
