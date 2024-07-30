import java.lang.*;
import java.util.Scanner;

class fibonacci
{
	
	public static void main(String []args)
	{
		Scanner s = new Scanner(System.in);
		int n1=0,n2=1,n3,i;
		System.out.println("Enter the number of days");
		int days=s.nextInt();
		
    System.out.println ("fibonacci series is");
		System.out.println(" "+ n1);
		System.out.println(" "+ n2);
		
		for(i=2;i<days;i++)
		{
			n3=n1+n2;
			System.out.println(" "+ n3);
			n1=n2;
			n2=n3;
			
		}
    System.out.println(" 23DCS043_Aesha kalathiya");
	}
	
}
