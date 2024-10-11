import java.util.Scanner;
class parent{
   void show1(){
     System.out.println("This is a parent class.");
	}
}
class child{
   void show2(){
     System.out.println("This is a child class.");
   }
}
public class prac17{
    public static void main(String[] args){
	    parent p1 = new parent();
	    child c1 = new child();
	    p1.show1();
              }
 }
