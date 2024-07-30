  import java.util.Scanner;
  class ractangle{
    float lenth, breadth;
    ractangle(){
    }
    ractangle(float l, float b){
        lenth = l;
        breadth = b;
    }
    float returnArea(){
        System.out.print("area of the ractangle is : ");
        return lenth*breadth;
    }
}
 public class Area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of rarctangle: ");
        float len = sc.nextFloat();
        System.out.print("Enter breadth of rarctangle: ");
        float br = sc.nextFloat();
        ractangle r1 = new ractangle(len,br);
        System.out.println( r1.returnArea());
        System.out.println("23DCS043_Aesha kalathiya");

        //ractangle r2 = new ractangle();
        //System.out.println(r2.returnArea());
    }
}
