package business;

import static org.junit.Assert.*;
import model.Book;
import model.Pen;
import model.PriceDatabase;
import model.PrinterPaper;
import model.PrinterPaperType;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class ShoppingCartTest {

	private ShoppingCart cart1;
	private Book b1;
	private Pen p1;
	private PrinterPaper pp1;

	@Before
	public void setUp() throws Exception {
		// create products
		b1 = new Book("b1", "Macbeth");
		b1.setIsbn("123adc");
		p1 = new Pen("p1", "Ball pen");
		pp1= new PrinterPaper("ppt1","Kodak");
		pp1.setPaperType(PrinterPaperType.A4);
		// create shopping cart
		cart1 = new ShoppingCart();
		// update price database
		PriceDatabase.addProductPrice(b1, 30.0);
		PriceDatabase.addProductPrice(p1, 5.0);
		PriceDatabase.addProductPrice(pp1,10.0);

	}

	@Test
	public void addingItemsIntoTheShoppingCart() throws Exception {

		cart1.addItem(b1);
		cart1.addItem(p1);
		cart1.addItem(pp1);

		assertEquals(3, cart1.getTotalItems());

	}

	@Test
	public void addingTheSameItemMoreThanOnce() throws Exception {
		//add the same item 3 times
		cart1.addItem(b1);
		cart1.addItem(b1);
		cart1.addItem(b1);
		
		assertEquals(3,cart1.getTotalItems());
		
	}

	@Test
	public void testGetTotalCost() throws Exception {
		cart1.addItem(b1);
		cart1.addItem(b1);
		cart1.addItem(b1);
		cart1.addItem(p1);
		cart1.addItem(p1);
		cart1.addItem(pp1);
		cart1.addItem(p1);
		
		assertEquals(115.00,cart1.getTotalCost(),1e-3);
	}

}
