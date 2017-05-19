package business;

import java.util.HashMap;
import java.util.Map;

import model.ProductAndQuantity;
import model.PriceDatabase;
import model.Product;

/**
 * This class represents a shopping cart. It consist of a Map to hold the list of
 * items in the cart and methods to add items in the cart, print
 * the content of the cart and calculate the the total amount of the cart.
 * 
 * @author biswashgurung
 *
 */
public class ShoppingCart {

	// list of items 
	private Map<String, ProductAndQuantity> items;

	public ShoppingCart() {
		this.items = new HashMap<>();
	}

	public Map<String, ProductAndQuantity> getItems() {
		return items;
	}

	public void setItems(Map<String, ProductAndQuantity> items) {
		this.items = items;
	}

	/**
	 * Method to add a product into the the shopping cart.
	 * 
	 * @param product
	 */
	public void addItem(Product product) {
		if (this.items.containsKey(product.getId())) {
			ProductAndQuantity pAndQ = this.items.get(product.getId());
			int quantity = pAndQ.getQuantity() + 1;
			pAndQ.setQuantity(quantity);
		} else {
			this.items.put(product.getId(), new ProductAndQuantity(product, 1));
		}

	}

	/**
	 * Method to print the content of the cart.
	 * 
	 */
	public void printContents() {
		this.items.forEach((k,v)->{
			System.out.println(v.getProduct().getProductName() + ": "
					+ v.getQuantity() + " x "
					+ PriceDatabase.getPrice(v.getProduct()));
		});
	}

	/**
	 * Method to calculate the total cost of the cart.
	 * 
	 * @return
	 */
	public double getTotalCost() {
		double total = 0.0;
		for (ProductAndQuantity item : this.items.values()) {
			total += PriceDatabase.getPrice(item.getProduct())
					* item.getQuantity();
		}
		
		return total;
	}
	
	/**
	 * 
	 * @return
	 */
	public int getTotalItems(){
		int total=0;
		for(ProductAndQuantity item:this.items.values()){
			total+=item.getQuantity();
		}
		return total;
	}

}
