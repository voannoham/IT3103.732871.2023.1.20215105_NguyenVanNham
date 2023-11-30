package hust.soict.dsai.test.disc;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class TestPassingParameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creat new dvd object
		DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
		DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");
		
		swap(jungleDVD, cinderellaDVD);//call method swap
		//print title of 2 dvd after swapping
 		System.out.println("jungle dvd title: " + jungleDVD.getTitle());
		System.out.println("cinderella dvd title: " + cinderellaDVD.getTitle());
		
		changeTitle(jungleDVD, cinderellaDVD.getTitle());//change title
		//print title of dvd after changing title
		System.out.println("jungle dvd title: " + jungleDVD.getTitle());
	}
	
	//try to swap 2 dvd
	public static void swap(Object o1, Object o2) {
		Object tmp = o1;
		o1 = o2;
		o2 = tmp;
	}
	
	//change title of dvd 
	public static void changeTitle(DigitalVideoDisc dvd, String title) {
		String oldTitle = dvd.getTitle();//save old title
		dvd.setTitle(title);//set new title for dvd
		dvd = new DigitalVideoDisc(oldTitle);//assign dvd to new DigitalVideoDisc object
	}
}


