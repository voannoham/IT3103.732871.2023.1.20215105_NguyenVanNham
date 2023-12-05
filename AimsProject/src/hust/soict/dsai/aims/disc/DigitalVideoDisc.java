package hust.soict.dsai.aims.disc;
//Nguyễn Văn Nhâm 20215105
//lab2 DigitalVideoDisc.java
public class DigitalVideoDisc{
	private String title;//instance variable that stores the title
	private String category;//instance variable that stores the category
	private String director;//instance variable that stores the director
	private int length;//instance variable that stores the length
	private float cost;//instance variable that stores the cost
	
	//lab3
	private static int nbDigitalVideoDiscs = 0;//class variable
	private int id;//instance variable
	
	//constructor with parameter title
	public DigitalVideoDisc(String title) {
		this.title = title;
		id = ++nbDigitalVideoDiscs;//update number of dvd and assign to id
	}
	
	//constructor with parameter category, title and cost
	public DigitalVideoDisc(String title, String category, float cost) {
		this.title = title;
		this.category = category;
		this.cost = cost;
		id = ++nbDigitalVideoDiscs;//update number of dvd and assign to id
	}
	
	//constructor with parameter director, category, title and cost
	public DigitalVideoDisc(String title, String category, String director, float cost) {
		this.title = title;
		this.category = category;
		this.director = director;
		this.cost = cost;
		id = ++nbDigitalVideoDiscs;//update number of dvd and assign to id
	}
	
	//constructor with parameter title, category, director, length and cost
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		this.title = title;
		this.category = category;
		this.director = director;
		this.length = length;
		this.cost = cost;
		id = ++nbDigitalVideoDiscs;//update number of dvd and assign to id
	}
	
	//return the title
	public String getTitle() {
		return title;// gives the value of title to the calling method
	}
	
	//return the category
	public String getCategory() {
		return category;// gives the value of category to the calling method
	}
	
	//return the director
	public String getDirector() {
		return director;// gives the value of director to the calling method
	}
	
	//return the length
	public int getLength() {
		return length;// gives the value of length to the calling method
	}
	
	//return the cost
	public float getCost() {
		return cost;// gives the value of cost to the calling method
	}
	
	
  //set title
	public void setTitle(String title){
		this.title = title;
	}
	

  //return id
	public int getId(){
		return id;//gives the value of id to the calling method
	}
	
	//static method get static nbDigitalVideoDiscs value
	public static int getNbDigitalVideoDiscs(){
		return nbDigitalVideoDiscs;
	}

	// check if the corresponding disk is a match given the ID
		public boolean isMath(int id) {
			if (this.id == id) {
				return true;
			}
			else {
				return false;
			}
		}
		
		// check if the corresponding disk is a match given the title
			public boolean isMath(String title) {
				if (this.title == title) {
					return true;
				}
				else {
					return false;
				}
			}
}