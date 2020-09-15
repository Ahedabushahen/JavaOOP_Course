
public class Car {
	public static int tottald= 0;
	private int id;
	private int price;
	private int numberofseats;
	private int maxspeeed;
	private String color;
	private String company;
	
	public Car() { //independent constructor , no input!
		tottald++;
		this.id = tottald;
		this.price = 1500000;
		this.numberofseats =5;
		this.maxspeeed = 200;
		this.color ="black";
		this.company = "ford";
		
		
	}
	public Car(int price,int nos,int ms,String color,String company) { // input constructor 
		tottald++;
		this.id = tottald;
		this.price = price;
		this.numberofseats = nos;
		this.maxspeeed=ms;
		this.color = color;
		this.company = company;
	}
	/* Getters and Setters */
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getNumberofseats() {
		return numberofseats;
	}
	public void setNumberofseats(int numberofseats) {
		this.numberofseats = numberofseats;
	}
	public int getMaxspeeed() {
		return maxspeeed;
	}
	public void setMaxspeeed(int maxspeeed) {
		this.maxspeeed = maxspeeed;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public int getid() {
		return this.id;
	}
	public String toString() {
		return "Car [price=" + price + ", numberofseats=" + numberofseats + ", maxspeeed=" + maxspeeed + ", color="
				+ color + ", company=" + company + ", id=" + id +"]" ;
	}
	
	}

