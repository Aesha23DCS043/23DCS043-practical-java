import java.util.Scanner;

class hellow extends Thread
{
public void run()
{
System.out.println("'Extends Method Thread Class");
System.out.println("Hello World");
}
}
class hworld implements Runnable
{
public void run()
{
System.out.println("Runnable interface");
System.out.println("Hello World");
}
}
public class pra32
 {
    public static void main(String[] args) 
{
        // for  Thread class
        hellow thread1 = new hellow();
        thread1.start();

         hworld  runnable = new hworld();
        Thread thread2 = new Thread(runnable);
        thread2.start();
    }
}

