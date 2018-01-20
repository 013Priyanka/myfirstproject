package src;
import java.util.*;
public class Duplicate_Elements_In_Array 
{
	
	  public static void main(String[] args) 
	    {
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter no. of elements you want in array:");
	        int n = s.nextInt();
	        int a[] = new int[n];
	        System.out.println("Enter all the elements:");
	        for (int i = 0; i < n; i++) 
	        {
	            a[i] = s.nextInt();
	        }
	 
	        for (int i = 0; i < n-1; i++)
	        {
	            for (int j = i+1; j < n; j++)
	            {
	                if ((a[i] == a[j]) && (i != j))
	                {
	                    System.out.println("Duplicate Element : "+a[j]);
	                }
	            }
	        }
	    }    
	}

