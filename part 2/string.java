import java.util.Scanner;
  public class string {
    public static String front_times(String str, int n) {
      int len = 3;//we have 3 charactor to repeat 
      if (len > str.length()) {
         len = str.length();
      }

      //find substring 
      String sstr = str.substring(0, len);
      StringBuilder resultstr = new StringBuilder();
      for (int i = 0; i < n; i++) {
         resultstr.append(sstr);//add substring
      }

      return resultstr.toString();//return result
   }

   public static void main(String args[]) {
      Scanner in = new Scanner(System.in);

      System.out.println("ENTER STRING : ");
      String str = in.nextLine();

      System.out.println("ENTER NUMBER OF TIMES : ");
      int n = in.nextInt();

      System.out.println("RESULT STRING : " + front_times(str, n));
      System.out.println(“23DCS043_Aesha kalathiya”);
}
}
