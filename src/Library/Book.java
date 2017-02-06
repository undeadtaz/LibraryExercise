package Library;

public class Book {
	private enum Type {PAPERBACK, HARDBACK, MAGAZINE};
	private Type type;
	private String author;
	private String title;
	public Book(String title, String author, Type type){
		this.title = title;
		this.author = author;
		this.type = type;
		
	}
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
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
}
