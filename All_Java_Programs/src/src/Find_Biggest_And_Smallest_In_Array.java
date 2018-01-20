package src;

import java.util.Scanner;

public class Find_Biggest_And_Smallest_In_Array 
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
                int smallest = a[0];
                int biggest = a[0];
               
                for(int i=1; i<n; i++)
                {
                        if(a[i] > biggest)
                                biggest = a[i];
                        else if(a[i] < smallest)
                                smallest = a[i];
                       
                }
               
                System.out.println("Largest Number is : " + biggest);
                System.out.println("Smallest Number is : " + smallest);
        }
}

