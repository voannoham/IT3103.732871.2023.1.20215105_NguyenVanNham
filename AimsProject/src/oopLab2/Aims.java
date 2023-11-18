package oopLab2;
//Nguyễn Văn Nhâm 20215105
///lab 2 Aims.java
public class Aims {
	public static void main(String[] args) {
		//creat a new cart
		Cart anOrder = new Cart();
		
		//creat new dvd object and add them to cart
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King",
				"Animation", "Roger Allers", 87, 19.95f);
		anOrder.addDigitalVideoDisc(dvd1);
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars",
				"Science fiction", "Geogre Lucas", 87, 24.95f);
		anOrder.addDigitalVideoDisc(dvd2);
		
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin",
				"Animation", 18.99f);
		anOrder.addDigitalVideoDisc(dvd3);
		
		//print total cost of the items in the cart
		System.out.printf("NguyenVanNham20215105-Total Cost is: %.2f\n",anOrder.totalCost());
		anOrder.removeDigitalVideoDisc(dvd1);
		//print print total cost of the items in the cart after remove
		System.out.printf("NguyenVanNham20215105-after remove dvd1, Total Cost is: %.2f\n",anOrder.totalCost());
	}
}
