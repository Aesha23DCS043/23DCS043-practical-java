import java.util.Scanner;

public class pra8 {
    
    public static int main(int arr[]) {
      int count = 0;
      for (int i = 0; i < arr.length; i++) {
         if (arr[i] == 9) {
            count++;
         }
      }
      return count;
   }

   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);

      System.out.print("Enter array size : ");
      int size = sc.nextInt();

      int arr[] = new int[size];

      for (int i = 0; i < arr.length; i++) {
         System.out.print("Enter " + (i + 1) + "th element : ");
         arr[i] = sc.nextInt();
      }
      System.out.println("Total 9's in an array : " + main(arr));
      System.out.println("23DCS043_Aesha kalathiya");

    }
}
