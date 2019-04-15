package welcome;
/*
 * @author Leemarie Collet /
 * Description of program ~ program will be fun, interactive quiz.
 * Here are some brief definitions:
 *  Byte ~ is an 8-bit signed two's complement integer, and is useful for saving memory in large arrays, where the memory savings actually matters.
 *  short ~ is a 16-bit signed two's complement integer, and is also used for saving memory in large arrays.
 *  int ~ in most cases it is a 32-bit signed two's complement integer.
 *  long ~ is a 64-bit two's complement integer, you  Use this data type when you need a range of values wider than those provided by int.
 *  float ~  is a single-precision 32-bit IEEE 754 floating point.
 *  double ~  is a double-precision 64-bit IEEE 754 floating poin.
 *  boolean ~ has only two possible values: true and false. Use this data type for simple flags that track true/false conditions.
 *  char ~  is a single 16-bit Unicode character.
 *  
 */
// This is a header
// public is an access modifier
// void to the return type; meaning this method doesn't return anything
// method names should be in lowerCamelCase and be named with a verb
// The operator == when used with objects will test whether the two operands refer to the same object in memory.
// Operator precedence means When several operations occur in an expression, each part is evaluated and resolved in a predetermined order.
import java.io.InputStream;
import java.util.Scanner;
public class Main {

  public static void main(String[] args) {
// On line 26  is what we would call a header.
	
    System.out.println("Hello, welcome to my Integration Project.");
    
     InputStream stream = System.in;
     Scanner scan = new Scanner(stream);
    
    System.out.println("Name:");
      String Input = scan.next();
    System.out.println("Hii! Welcome to my Integration project " + Input);
// The word "input" above is what we would call a method call in java.
    System.out.println("My project is a complication of everything I have learned in COP 2006.");
    
   
    scan.close();
    
    
  }
}
