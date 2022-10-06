package Lab05;

class MyBook{
	protected String title;
	protected int page;
	protected String author;
	static int count = 0;
	
	public MyBook() {
		count++;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public static int getCount() {
		return count;
	}
	
	public static int setCount() {
		return count;
	}


	
}

class Magazine extends MyBook{
	private String date;
	
	Magazine(){
		super();
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
	
}

public class Test2 {

}
