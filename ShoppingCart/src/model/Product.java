package model;

public abstract class Product {
	
	private String id;
	private String productName;
	
	public Product(){
		this.id="";
		this.productName="";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	

}
