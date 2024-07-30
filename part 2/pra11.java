import java.util.Scanner;

public class pra11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "CHARUSAT UNIVERSITY";
        System.out.println("Lenth of the string:" + str.length());

        System.out.print("Enter the first latter of your name: ");
        char ch = sc.next().charAt(0);
        System.out.println("After replace H by first latter of your name : "+str.replace('H',ch));
      
        System.out.println("All characters in lowercase : "+str.toLowerCase());

       System.out.println("23DCS043_Aesha kalathiya");
      }
    
}
