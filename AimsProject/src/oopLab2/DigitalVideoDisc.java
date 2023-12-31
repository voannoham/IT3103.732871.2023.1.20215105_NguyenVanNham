package oopLab2;
//Nguyễn Văn Nhâm 20215105
//lab2 DigitalVideoDisc.java
public class DigitalVideoDisc{
	private String title;//instance variable that stores the title
	private String category;//instance variable that stores the category
	private String director;//instance variable that stores the director
	private int length;//instance variable that stores the length
	private float cost;//instance variable that stores the cost
	
	//constructor with parameter title
	public DigitalVideoDisc(String title) {
		this.title = title;
	}
	
	//constructor with parameter category, title and cost
	public DigitalVideoDisc(String title, String category, float cost) {
		this.title = title;
		this.category = category;
		this.cost = cost;
	}
	
	//constructor with parameter director, category, title and cost
	public DigitalVideoDisc(String title, String category, String director, float cost) {
		this.title = title;
		this.category = category;
		this.director = director;
		this.cost = cost;
	}
	
	//constructor with parameter title, category, director, length and cost
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		this.title = title;
		this.category = category;
		this.director = director;
		this.length = length;
		this.cost = cost;
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
}