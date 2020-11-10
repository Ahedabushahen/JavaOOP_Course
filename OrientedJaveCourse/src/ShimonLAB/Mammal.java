package ShimonLAB;

public class Mammal {
	private double weight;
	private int getstation;

	public Mammal(double weight,int getstation){
		this.weight = weight;
		this.getstation = getstation;
	}
	public Mammal(){
		this.weight = 2.23;
		this.getstation = 1;
		
	}
	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public int getGestation() {
		return getstation;
	}

	public void setGetstation(int getstation) {
		this.getstation = getstation;
	}
}
