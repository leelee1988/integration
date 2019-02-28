package welcome;

public class CompareDemo {

  public static void main(String[] args) {

      String apples = "5";
      
      String bananas = "10";
      
      System.out.println(apples.compareTo(bananas));
      System.out.println(bananas.compareTo(apples));
      System.out.println(bananas.compareTo(bananas));
      System.out.println(apples.compareTo(apples));
  }

}
