import java.lang.*;
import java.util.Scanner;

class speed
{
	
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the distence in meter");
		float d=sc.nextFloat();
		
		System.out.println("enter the time(in hour,min.,sec.)");
		float h=sc.nextFloat();
		float m=sc.nextFloat();
		float s=sc.nextFloat();
		
		float time=(h*3600)+(m*60)+s;
		System.out.println("time is "+time);
		float speed =d/time;
		System.out.println("speed is " +speed);
		float kph=(d/1000)/(time/3600);
		System.out.println("Your speed in km/h is "+kph);
		
		float mph=(kph*1000)/1906;
		System.out.println("Your speed in miles/h is "+mph);
    System.out.println(" 23DCS043_Aesha kalathiya");
	}
}

