package model;

/**
 * This class represents a product and it's quantity in the shopping cart
 * 
 * @author biswashgurung
 *
 */
public class ProductAndQuantity {
	
	private Product product;
	private int quantity;
	
	public ProductAndQuantity(Product product,int quantity){
		this.product = product;
		this.setQuantity(quantity);
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
