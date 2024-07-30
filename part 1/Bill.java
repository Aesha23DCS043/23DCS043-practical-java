import java.lang.*;
import java.util.Scanner;

class Bill
{
public static void main(String []args)
{
Scanner s=new Scanner(System.in);
        float motorTax = 0.08f;
        float fanTax = 0.12f;
        float tubeTax = 0.05f;
        float wiresTax = 0.075f;
        float otherItemTax = 0.03f;
		float sum=0;
		
		System.out.print("Enter 1 for motor, 2 for fan, 3 for tube, 4 for wires: ");
    int code=s.nextInt();
		System.out.print("Enter price of the item: ");
    float price = s.nextFloat();
		switch(code)
		{
		    case 1:
			      System.out.print("Enter quantity ");
			      int q1=s.nextInt();
		        sum = q1*price * motorTax;
            break;
        case 2:
			      System.out.print("Enter quantity ");
			      int q2=s.nextInt();
            sum = q2*price * fanTax;
            break;
        case 3:
			      System.out.print("Enter quantity ");
			      int q3=s.nextInt();
            sum = q3*price * tubeTax;
            break;
        case 4:
			      System.out.print("Enter quantity ");
			      int q4=s.nextInt();
            sum = q4*price * wiresTax;
            break;
        default:
			      System.out.print("Enter quantity ");
			      int q5=s.nextInt();
            sum = q5*price * otherItemTax;
            break;
		}
		float totalAmount = price + sum;

        System.out.println("Item price: $" + price);
        System.out.println("Tax amount: $" + sum);
        System.out.println("Total amount (including tax): " + totalAmount);
 System.out.println(" 23DCS043_Aesha kalathiya");

}
}
