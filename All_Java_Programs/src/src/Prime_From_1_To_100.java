package src;
import java.util.*;
public class Prime_From_1_To_100 
{
 public static void main(String args[])
	    {
	        Scanner scan = new Scanner(System.in);
	        int n = 100;
	        System.out.println("Prime no. from 1 to 100 are=");
	        for(int i=2;i<=n;i++) 
	        {
	            int flag = 1;
	            for(int j=2;j<=i/2;j++)  
	            {
	                if(i%j==0) 
	                {
	                    flag = 0;
	                    break;
	                }

	            }
	            if(flag==1) 
	            {
	                System.out.println(i+" ");
	            }
	        }
	    }
	}

