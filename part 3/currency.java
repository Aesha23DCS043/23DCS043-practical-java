import java.util.*;
public class currency {
   public static void main(String args[]) {
      Scanner in = new Scanner(System.in);
      System.out.println("Enter the amount in Pounds: ");
      float amount = in.nextFloat();
      currency cr = new currency(amount);
      cr.print();
      System.out.println("\n23DCS043_Aesha kalathiya");
   }
}
class currency {
   private float pound;
   private float rupee;
   currency() {
      pound = 0;
      rupee = 0;
   }
   currency(float pound) {
      this.pound = pound;
      rupee = pound * 100;
   }
   public void print() {
      System.out.println("CURRENCY IN RUPEE : " + rupee);
      System.out.println("CURRENCY IN POUND : " + pound);
   }
}
