import java.util.Scanner;
 class pra25 
{
    public static void main(String[] args)
{
        Scanner sc = new Scanner(System.in);

        try 
      {
            int[] arr = {10, 20, 30};
            System.out.println("Enter The Value: " );
            int index = sc.nextInt();
            System.out.println("Value at index " + index + ": " + arr[index]);
           } 
  catch (ArrayIndexOutOfBoundsException e) 
       {
            System.out.println("Array Index out of Bound Exception is Handled: " + e);
             System.out.println("23DCS043_Aesha kalathiya");

        }
}
