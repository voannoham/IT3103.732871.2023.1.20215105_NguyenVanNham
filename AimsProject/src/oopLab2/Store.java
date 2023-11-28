//lab3 NguyenVanNham20215105
//Store.java
package oopLab2;

public class Store {
	public static final int SIZE = 100;//the size of array of dvd
	private DigitalVideoDisc[] itemsInStore = new DigitalVideoDisc[SIZE];
	private int qtyOrdered = 0;// number of DVD are in the store
	
	//add an item to the store
	public void addDVD(DigitalVideoDisc disc) {
		itemsInStore[qtyOrdered] = disc;//add disc
	    qtyOrdered++;//update number of DVD in the store
	    System.out.printf("NguyenVanNham20215105-The disc %s has been added.\n",disc.getTitle());
	}
	
	//remove an item from the store
	public void removeDVD(DigitalVideoDisc disc){
		for(int i = 0; i < qtyOrdered; i++){//loop all DVD in the store
			if( itemsInStore[i].getTitle() == disc.getTitle() ){//find the disc to remove in array
				for (int j = i; j < qtyOrdered - 1; j++) {//remove disc i
					itemsInStore[j] = itemsInStore[j+1];
				}
				qtyOrdered--;//update number of DVD in  the cart
				break;//exit outer for loop
			} 
		}
		System.out.printf("NguyenVanNham20215105-The disc %s has been remove.\n",disc.getTitle());
	}
}
