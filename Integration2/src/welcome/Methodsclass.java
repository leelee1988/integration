package welcome;
public class Methodsclass {

  public static void main(String[] args) {
  
    Boolean out = "methods".equals("methods"); 
       System.out.println("Checking Equality  " + out); 
       out = "methods".equals("Methods"); 
       System.out.println("Checking Equality  " + out); 
 
       out = "Methods".equalsIgnoreCase("mEthods "); 
       System.out.println("Checking Equality" + out); 
 
       System.out.println("If s1 = s2" + out); 
  
       String word1 = "LeeMarie"; 
       System.out.println("Changing to lower Case " + word1.toLowerCase()); 
 
       System.out.println("Changing to UPPER Case " + word1.toUpperCase()); 

  }

}
