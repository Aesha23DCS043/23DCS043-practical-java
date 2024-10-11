import java.util.Scanner;
public class pra35
{
public static void main(String[] args)
{
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter a Value of  Variable :");
  int value = sc.nextInt();
Runnable increment = new Runnable()
{
public void run(){
try {
Thread.sleep(5000);
System.out.println("Incremented Value :" + (value+1));
}
catch (InterruptedException e)
{
System.out.println("The Interrupt was Occurred in Thread.");
}
}
};
Thread incrementThread = new Thread(increment);
incrementThread.start();
}
}
