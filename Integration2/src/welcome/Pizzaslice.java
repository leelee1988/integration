package welcome;
import java.util.Scanner; 
import java.lang.Math;

public class Pizzaslice {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Tell me the size of your slice and I will tell"); 
    System.out.println("you which is larger, the number entered, or PI");
    double slice = scan.nextDouble();
    
    System.out.println(Math.max(slice, Math.PI));
      
  }
}

