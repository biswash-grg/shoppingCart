package model;

public class Book extends Product {
	
	private String isbn;
	
	public Book (String id,String title){
		this.setId(id);
		this.setProductName(title);
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

}
