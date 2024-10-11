class FirstThread extends Thread 
{
    public void run()
 {
        System.out.println("First Thread is running with priority: " + this.getPriority());
    }
}

class SecondThread extends Thread 
{
    public void run() 
{
        System.out.println("Second Thread is running with priority: " + this.getPriority());
    }
}

class ThirdThread extends Thread 
{
    public void run() 
{
        System.out.println("Third Thread is running with priority: " + this.getPriority());
    }
}

public class pra36  
{
    public static void main(String[] args) 
{
        FirstThread first = new FirstThread();
        SecondThread second = new SecondThread();
        ThirdThread third = new ThirdThread();

        first.setPriority(3);
        second.setPriority(); 
        third.setPriority(7);

        first.start();
        second.start();
        third.start();
    }
}
