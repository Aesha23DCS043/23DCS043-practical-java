import java.util.Scanner;
class Shape{
    void printShape(){
	System.out.println("This is shape.");
	}
}
class Rectangle extends Shape{
    void printRectangle(){
	System.out.println("This is rectangular shape.");
	}
}
class Square extends Rectangle{
    void printSquare(){
	System.out.println("Square is a rectangle");
	}
}
class Circle extends Shape{
    void printCircle(){
	System.out.println("This is circular shape.");
	}
} 
class pra20{
    public static void main(String[]args){
	  Square s1 = new Square();
	  s1.printShape();
	  s1.printRectangle();
	  System.out.println("23DCS043_Aesha kalathiya");
	}
}
