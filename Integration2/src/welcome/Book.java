package welcome;

public class Book {
	    private String bookTitle;
	    private String bookAuthor;
	    private int numOfPages;
	 
	    /* zero argument constructor */
	    public Book ()
	    {
	        bookTitle = null;
	        bookAuthor = null;
	        numOfPages = 0;  
	    }
	 
	    /* constructor with parameters */
	    public Book (String bookTitle, String bookAuthor, 
	                 int numOfPages)
	    {
	        this.bookTitle = bookTitle;
	        this.bookAuthor = bookAuthor;
	        this.numOfPages = numOfPages;  
	    }
	 
	    public String getBookTitle()
	    {
	        return bookTitle;
	    }
	 
	    public void setBookTitle(String bookTitle)
	    {
	        this.bookTitle = bookTitle;
	    }
	 
	    public String getBookAuthor()
	    {
	        return bookAuthor;
	    }
	 
	    public void setBookAuthor(String bookAuthor)
	    {
	        this.bookAuthor = bookAuthor;
	    }
	 
	    public int getNumOfPages()
	    {
	        return numOfPages;
	    }
	 
	    public void setNumOfPages(int numOfPages)
	    {
	        this.numOfPages = numOfPages;
	    }
	}

