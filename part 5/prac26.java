import java.util.Scanner;
import java.io.IOException;

class prac26
{
    public static void main(String[] args) 
{
        try 
{
        
            throw new IOException("IOException");
        }
 catch (IOException e) 
{
            System.out.println("Found Checked Exception: " + e.getMessage());
        }

        try
 {
            int result = 10 / 0; 
        } 
catch (ArithmeticException e)
 {
            System.out.println("Found Unchecked Exception: " + e.getMessage());
        }

        try 
{
            String str = null;
            str.length(); 
        } 
catch (NullPointerException e) 
{
            System.out.println("Found Unchecked Exception: " + e.getMessage());
        }

        System.out.println("23DCS043_Aesha kalathiya");
    }
}
