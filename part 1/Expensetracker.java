import java.lang.*;
import java.util.Scanner;

class Expensetracker
{
public static void main(String []args)
{
	int i,n;
	float sum=0;
float[] a = new float[50];
Scanner s=new Scanner(System.in);
System.out.print("Enter the number of element in the array ");
 n=s.nextInt();


for ( i = 0; i < n; i++) 
        {
            System.out.print("Enter array element " + (i + 1) + ": ");
            a[i] = s.nextFloat();
		}
        for (i=0;i<n;i++)
		{
             sum=sum+a[i];
        }

        System.out.println("Total expenses for the month " + sum);
        System.out.println(" 23DCS043_Aesha kalathiya");
         }

}
