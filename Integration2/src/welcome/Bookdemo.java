package welcome;

public class Bookdemo {
	  public static void main(String args[])
	  {
	    Book b = new Book("Courtney Peppernell", "Pillow Talk", 272);
	    System.out.println("Book's Author: " + b.getBookAuthor());
	    System.out.println("Book's Title: " + b.getBookTitle());
	    System.out.println("Number of Pages: " + b.getNumOfPages());
	  }
	}  

