package ch08.prgm;

class Book {
	private String title;
	private String author;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
}

public class prgm02 {

	public static void main(String[] args) {
		Book b1 = new Book();
		b1.setAuthor("¼£·Ô ºê·ÐÅ×");
		b1.setTitle("Á¦ÀÎ ¿¡¾î");
	}

}
