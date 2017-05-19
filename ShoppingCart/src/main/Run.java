package main;

import model.Book;
import model.Pen;
import model.PriceDatabase;
import model.PrinterPaper;
import model.PrinterPaperType;
import business.ShoppingCart;

public class Run {

	public static void main(String[] args) {
		
		//create products
		Book b1 = new Book("b1","Macbeth");
		b1.setIsbn("123adc");
		Pen p1 = new Pen("p1","Ball pen");
		PrinterPaper pp1= new PrinterPaper("ppt1","Kodak");
		pp1.setPaperType(PrinterPaperType.A4);
		
		//update price database 
		PriceDatabase.addProductPrice(b1,30.0);
		PriceDatabase.addProductPrice(p1,5.0);
		PriceDatabase.addProductPrice(pp1,10.0);
		
		//add item to buy in the shopping cart
		ShoppingCart cart1 = new ShoppingCart();
		cart1.addItem(b1);
		cart1.addItem(b1);
		cart1.addItem(b1);
		cart1.addItem(p1);
		cart1.addItem(pp1);
		
		
		
		//print the total no of items in the cart
		System.out.println("Total no of items: "+cart1.getTotalItems());
		
		//print the contents of the shopping cart
		cart1.printContents();
		
		//print the total 
		System.out.println("Total cost: "+cart1.getTotalCost());
		
	}

}
