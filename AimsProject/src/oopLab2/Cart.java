//Nguyen Van Nham 20215105
//lab2-3 Cart.java
package oopLab2;
public class Cart {
	public static final int MAX_NUMBER_ORDERED = 20; //constant max number order of DVD
	
	private DigitalVideoDisc[] itemsOrdered = 
			new DigitalVideoDisc[MAX_NUMBER_ORDERED];// create array of DVD objects
	private int qtyOrdered = 0;// number of DVD are in the cart
  
	//add an item to the list
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
      if (qtyOrdered >= itemsOrdered.length) {//check if the cart is full 
          System.out.println("NguyenVanNham20215105-The cart is almost full.");
      } else {
          itemsOrdered[qtyOrdered] = disc;//add disc
          qtyOrdered++;//update number of DVD in the cart
          System.out.printf("NguyenVanNham20215105-The disc %s has been added.\n",disc.getTitle());
      }
	}
	
	//remove the item passed by argument from the list
	public void removeDigitalVideoDisc(DigitalVideoDisc disc){
		for(int i = 0; i < qtyOrdered; i++){//loop all DVD in the cart
			if( itemsOrdered[i].getTitle() == disc.getTitle() ){//find the disc to remove in array
				for (int j = i; j < qtyOrdered - 1; j++) {//remove disc i
					itemsOrdered[j] = itemsOrdered[j+1];
				}
				qtyOrdered--;//update number of DVD in  the cart
				break;//exit outer for loop
			} 
		}
		System.out.printf("NguyenVanNham20215105-The disc %s has been remove.\n",disc.getTitle());
	}
  
	//sums the costs of the individual DigitalVideoDiscs
	public float totalCost() {
		float sum = 0;//inital sum = 0
		for (int i = 0; i < qtyOrdered; i++) {//add all cost of cart to sum
			sum += itemsOrdered[i].getCost();
		}
		return sum;//gives the value of sum to the calling method
	}
	
	//print the list of a cart
	public void print() {
		System.out.printf("Ordered Items:\n");
		for (int i = 0; i < qtyOrdered; i++) {
			System.out.printf("%d.DVD-[%s]-[%s]-[%s]-[%d]:[%.2f]$\n",itemsOrdered[i].getId(), itemsOrdered[i].getTitle(), itemsOrdered[i].getCategory(), itemsOrdered[i].getDirector(), itemsOrdered[i].getLength(), itemsOrdered[i].getCost());
		}
		System.out.printf("Total cost: %.2f\n",totalCost());
	}
	
	//search by id
	public void searchId(int discId){
	    boolean flag = false;//indicate no match
	    int i;
		for (i = 0; i < qtyOrdered; i++) {
			if (itemsOrdered[i].isMath(discId) == true){
				flag = true;//indicate successfully match
				break;
			}
		}
		//print result
		if (flag == false) {//no match
			System.out.printf("NguyenVanNham20215105-not found\n");
		}
		else {//find successful
			System.out.printf("NguyenVanNham20215105-find successful:\n");
			System.out.printf("%d.DVD-[%s]-[%s]-[%s]-[%d]:[%.2f]$\n",itemsOrdered[i].getId(), itemsOrdered[i].getTitle(), itemsOrdered[i].getCategory(), itemsOrdered[i].getDirector(), itemsOrdered[i].getLength(), itemsOrdered[i].getCost());
		}
	}
	
	//search by title
		public void searchTitle(String discTitle){
		    boolean flag = false;//indicate no match
		    int i;
			for (i = 0; i < qtyOrdered; i++) {
				if (itemsOrdered[i].isMath(discTitle) == true){
					flag = true;//indicate successfully match
					break;
				}
			}
			//print result
			if (flag == false) {//no match
				System.out.printf("NguyenVanNham20215105-not found\n");
			}
			else {//find successful
				System.out.printf("NguyenVanNham20215105-find successful:\n");
				System.out.printf("%d.DVD-[%s]-[%s]-[%s]-[%d]:[%.2f]$\n",itemsOrdered[i].getId(), itemsOrdered[i].getTitle(), itemsOrdered[i].getCategory(), itemsOrdered[i].getDirector(), itemsOrdered[i].getLength(), itemsOrdered[i].getCost());
			}
		}
}





