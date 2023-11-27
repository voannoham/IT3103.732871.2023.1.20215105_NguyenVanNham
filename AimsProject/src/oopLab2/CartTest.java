package oopLab2;

public class CartTest {
	public static void main(String[] args) {
		//creat a new cart
		Cart cart = new Cart();
		
		//creat new dvd object and add them to cart
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King",
				"Animation", "Roger Allers", 87, 19.95f);
		cart.addDigitalVideoDisc(dvd1);
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars",
				"Science fiction", "Geogre Lucas", 87, 24.95f);
		cart.addDigitalVideoDisc(dvd2);
		
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin",
				"Animation", 18.99f);
		cart.addDigitalVideoDisc(dvd3);
		
		//Test the print method
		cart.print();
		//to--do:test the search methods here
		//Test the print method
				cart.print();
				//to--do:test the search methods here
				//search by id
				cart.searchId(2);
				cart.searchId(4);
				
				//search by title
				cart.searchTitle("Star Wars");
				cart.searchTitle("4343");
	}
}