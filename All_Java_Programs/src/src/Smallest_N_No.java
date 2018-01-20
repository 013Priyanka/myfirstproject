package src;
import java.util.Scanner;

public class Smallest_N_No
{
	 public static void main(String argn[])
  {
	Scanner sc = new Scanner(System.in);
	int num, i, temp, small;
	
	System.out.print("How many number you want to enter:");
	num = sc.nextInt();
	System.out.println("Enter " +num+ " number");
	small =sc.nextInt();
	for (i=1; i < num; i++)
	{
	temp = sc.nextInt();
	if(temp > small)
	   continue;
	else
	small = temp;
    }
    System.out.println("Smallest Number is "+small);

	}
	}




