package yaip;

public class Book {
	private String name;
	private Author[] authors;
	private double price;
	private int quantity = 0;
	
	public Book(String name, Author[] authors, double price) {
		this.name = name;
		this.authors = authors;
		this.price = price;
	}
	
	public Book(String name, Author[] authors, double price, int quantity) {
		this.name = name;
		this.authors = authors;
		this.price = price;
		this.quantity = quantity;
	}
	
	public String getName() {
		return name;
	}

	public Author[] getAuthor() {
		return authors;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public String getAuthorsName() {
		String listeNoms = "";
		listeNoms += authors[0].getName();
		for (int i = 1; i < authors.length; i++) {
			listeNoms += ",";
			listeNoms += authors[i].getName();
		};
		return listeNoms;
	}
	
	public String getAuthorEmail() {
		String listeEmail = "";
		for (Author author : authors) {
			listeEmail += author.getEmail();
		};
		return listeEmail;
	}
	
	public String getAuthorGender() {
		String listeChar = "";
		for (Author author : authors) {
			listeChar += author.getGender();
		};
		return listeChar;
	}
	
	public String toString() {
		String listAuthors = "";
		listAuthors += authors[1].toString();
		for (int i = 1; i < authors.length; i++) {
			listAuthors += ",";
			listAuthors += authors[i].toString();
			
		}
		return "[name=" + name + "," + listAuthors.toString() + ",price=" + price + ",quantity=" + quantity + "]";
	}

}
