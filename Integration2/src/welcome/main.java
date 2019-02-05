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
 */
import java.io.InputStream;
import java.util.Scanner;
public class main {

  public static void main(String[] args) {
    System.out.println("Hello, welcome to my Integration Project.");
    
       InputStream stream = System.in;
     Scanner scan = new Scanner(stream);
    
    System.out.println("Name:");
      String input = scan.next();
    System.out.println("Hii! Welcome to my fun, and interative quiz " + input);
    
     scan.close();
  }
}
