import java.util.Scanner;
class InvalidEntryException extends Exception 
{
    public InvalidEntryException(String message)
 {
        super(message);
    }
}

 class prac26
{
    public static void checkEntry(int entry) throws InvalidEntryException 
{
        if (entry > 25) 
{
            throw new InvalidEntryException ("You Cannot Get in The Competition.");
        }
 else 
{
            System.out.println("Valid entry: " + entry);
        }
    }
    public static void main(String[] args) 
{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the competition entry: ");
        int entry = sc.nextInt();

        try 
{
            checkEntry(entry);
 } 

catch (InvalidEntryException e) 
{
            System.out.println("Caught Exception: " + e.getMessage());
  } 
           System.out.println("23DCS043_Aesha kalathiya");
    }
}
