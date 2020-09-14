
public class Car {
	private int price;
	private int numberofseats;
	private int maxspeeed;
	private String color;
	private String company;
	
	public Car() { //independent constructor , no input!
		this.price = 1500000;
		this.numberofseats =5;
		this.maxspeeed = 200;
		this.color ="black";
		this.company = "ford";
		
		
	}
	public Car(int price,int nos,int ms,String color,String company) { // input constructor 
		this.price = price;
		this.numberofseats = nos;
		this.maxspeeed=ms;
		this.color = color;
		this.company = company;
	}
}
