import java.util.*;
class Employee{
    Scanner sc = new Scanner(System.in);
    String fs = sc.nextLine();
    String ls = sc.nextLine();
    double salary;
      Employee(){
      }
      Employee(String F, String L, double SAL){
        fs = F;
        ls = L;
        salary = SAL;
    }

    void setfs()
   {
        System.out.println("Enter the first name: ");
        fs = sc.nextLine();
    }

    void setls()
    {
        System.out.println("Enter the last name: ");
        ls = sc.nextLine();
    }
    void setsal()
    {
        System.out.println("Enter salary: ");
        salary = sc.nextDouble();
        if(salary <= 0){
            System.out.println("0.0");
        } else {
            System.out.println(salary + (0.1f*salary));
        }
    }
    
    String getfs()
    {
        return fs;
    }

    String getls()
    {
        return ls;
    }
    double getsal()
    {
        return salary;
    }
    }
 public class EmployeeTest {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.setfs();
        e1.setls();
        e1.setsal();
        System.out.println(e1.getfs());
        System.out.println(e1.getls());
        System.out.println(e1.getsal());
       }
       System.out.println("23DCS043_Aesha kalathiya");
}
