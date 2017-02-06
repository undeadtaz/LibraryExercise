package Library;

public class Book {
	
	private String author;
	private String title;
	private int id;
	
	public Book(String title, String author,  int id){
		this.title = title;
		this.author = author;
		
		this.setId(id);
		

	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}
