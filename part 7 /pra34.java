import java.util.Scanner;

class RandomNumberGenerator extends Thread 
{
    private Scanner;

    public RandomNumberGenerator(Scanner scanner) 
{
        this.scanner = scanner;
    }

    public void run() 
{
        try 
{
            while (true) 
{
                System.out.print("Enter a random integer: ");
                int number = scanner.nextInt();
             if(number ==0)
            {
             System.out.println("Done.!!");
             break;
             }
                System.out.println("Generated Number: " + number);
                if (number % 2 == 0) {
                    new Thread(new Square(number)).start();
                } else {
                    new Thread(new Cube(number)).start();
                }
                Thread.sleep(1000); 
            }
        } 
catch (InterruptedException e) 
{
            System.out.println("Generator interrupted");
        }
    }
}

class Square implements Runnable
 {
    private int number;

    public Square(int number)
 {
        this.number = number;
    }

    public void run() 
{
        System.out.println("Square of " + number + " is: " + (number * number));
    }
}
class Cube implements Runnable {
    private int number;

    public Cube(int number) 
{
        this.number = number;
    }

    public void run()
 {
        System.out.println("Cube of " + number + " is: " + (number * number * number));
    }
}

public class pra34
{
    public static void main(String[] args) 
{
        Scanner = new Scanner(System.in);
        RandomNumberGenerator generator = new RandomNumberGenerator(scanner);
        generator.start();
    }
}
