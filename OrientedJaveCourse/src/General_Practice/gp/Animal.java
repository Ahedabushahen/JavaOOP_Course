package General_Practice;

public abstract class Animal implements IEat {
	protected int weight;
	protected int height;
	protected String color;
	
	public Animal(int weight,int height, String color) {
		this.weight = weight;
		this.height = height;
		this.color = color + "";
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	public void eat() {
		System.out.println("i have eaten somthing!");
	}
}
