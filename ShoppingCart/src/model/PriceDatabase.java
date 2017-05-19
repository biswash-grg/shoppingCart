package model;

import java.util.HashMap;
import java.util.Map;

/**
 * This class represents a database where you could find the price of a product
 * 
 * @author biswashgurung
 *
 */
public final class PriceDatabase {
	
	private static Map<String,Double> listOfPrice= new HashMap<>();
	
	private PriceDatabase(){
	}
	
	public static Double getPrice(Product product){
		return listOfPrice.get(product.getId());
	}
	
	public static void addProductPrice(Product product,Double price){
		listOfPrice.put(product.getId(), price);
	}
	

}
