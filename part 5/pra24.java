import java.util.Scanner;
class pra24 
{
    public static void main(String[] args) 
{
        Scanner scanner = new Scanner(System.in);
  
        try 
{           
        System.out.print("A Value of x: ");
        int x = scanner.nextInt();
        
        System.out.print("A Value of y: ");
        int y = scanner.nextInt();

            int z = x / y;
            System.out.println("z: " + z);
 } 
catch (Exception e) 
      {
            System.out.println("Exception is Handled: " + e);
        
        }
         System.out.println("23DCS043_Aesha kalathiya");
}
}
