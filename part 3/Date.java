import java.util.Scanner;
  class Date{
    Scanner sc = new Scanner(System.in);
    int date,month,year;
    Date(){
    }

    Date(int D, int M, int Y){
        date = D;
        month = M;
        year = Y;
    }
    void setd()
    {
        System.out.print("enter date: ");
        date = sc.nextInt();
    }
    void setm()
    {
        System.out.print("enter month: ");
        month = sc.nextInt();
    }
    void sety()
    {
        System.out.print("enter year: ");
        year = sc.nextInt();
    }
    int getd()
    {
        return date;
    }
    int getm()
    {
        return month;
    }
    int gety()
    {
        return year;
    }
    void DisplayDate() {
        System.out.println(date + "/"+ month+ "/"+ year);
     }
}
 public class dateTest {
    public static void main(String[] args) {
        Date d1 = new Date();
        d1.setd();
        d1.setm();
        d1.sety();
        System.out.print("date is: ");
        d1.DisplayDate();

        System.out.println("23DCS043_Aesha kalathiya");
       }
}
