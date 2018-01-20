package src;

import java.util.Scanner;

public class FactorialExample 
{  
		 public static void main(String args[])
		 {  
			 Scanner sc = new Scanner(System.in);
			 System.out.print("Enter a number");
			int num=sc.nextInt();
		  int i,fact=1;  
		  for(i=1;i<=num;i++)
		  {    
		      fact=fact*i;    
		  }    
		  System.out.println("Factorial of "+num+" is: "+fact);    
	}  
}  

