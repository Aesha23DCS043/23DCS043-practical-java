import java.util.Scanner;
class Degree{
    void getDegree(){
	    System.out.println("I got a degree.");
	}
}
class Undergraduate extends Degree{
    void getDegree(){
	    System.out.println("I am an Undergraduate");
	}
}
class Postgraduate extends Degree{
    void getDegree(){
	    System.out.println("I am a Postgraduate.");
    
    }
}
class pra21{
    public static void main(String[]args){
	   Degree D1 = new Degree();
	   D1.getDegree();
	   
	   Undergraduate U1 = new Undergraduate();
	   U1.getDegree();
	   
	   Postgraduate P1 = new Postgraduate();
	   P1.getDegree();
	   System.out.println("23DCS043_Aesha kalathiya");
	}
}
