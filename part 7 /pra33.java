import java.util.Scanner;

public class pra33 
{
    public static void main(String[] args) 
{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Value of N:");
        int N = sc.nextInt();
        System.out.println("Enter no of Threads:");
        int noThread = sc.nextInt();

        int[] numbers = new int[N];
        for (int i = 0; i < N; i++) {
            numbers[i] = i + 1;
        }

        SumTask[] tasks = new SumTask[noThread];
        Thread[] threads = new Thread[noThread];
        int total = N / noThread;
        int start = 0;

        for (int i = 0; i < noThread; i++) 
{
            int end = (i == noThread - 1) ? N : start + total;
            tasks[i] = new SumTask(numbers, start, end);
            threads[i] = new Thread(tasks[i]);
            threads[i].start();
            start = end;
 }

        long totalSum = 0;
        for (int i = 0; i < noThread; i++)
 {
            Try
 {
                threads[i].join();
                totalSum = totalSum + tasks[i].getSum();
  } 
catch (InterruptedException e) 
{
                e.printStackTrace();
            }
        }

        System.out.println("Total Sum: " + totalSum);
    }
}

class SumTask implements Runnable 
{
    int[] numbers;
    int start;
    int end;
    long sum;

    public SumTask(int[] numbers, int start, int end) 
{
        this.numbers = numbers;
        this.start = start;
        this.end = end;
        this.sum = 0;
    }
    public long getSum() 
{
        return sum;
    }
    public void run()
 {
        for (int i = start; i < end; i++) {
            sum += numbers[i];
        }
    }
}
