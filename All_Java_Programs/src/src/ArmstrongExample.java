//https://github.com/013Priyanka/myfirstproject
//https://github.com/013Priyanka/myfirstproject/tree/master/All_Java_Programs/src/src
package src;

import java.util.Scanner;

public class ArmstrongExample 
{ 
		  public static void main(String[] args)  
		  {  
			    Scanner sc = new Scanner(System.in);
			    System.out.print("Enter a number");
			    int n=sc.nextInt();
			    int c=0,a,temp;  
			      
			    temp=n;  
			    while(n>0)  
			    {  
			    a=n%10;  
			    n=n/10;  
			    c=c+(a*a*a);  
			    }  
			    if(temp==c)  
			    System.out.println(temp+" is an armstrong number");   
			    else  
			        System.out.println(temp+" is not armstrong number");   
			 }  
}  

