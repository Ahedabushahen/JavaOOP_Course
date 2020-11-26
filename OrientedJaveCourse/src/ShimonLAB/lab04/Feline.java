package ShimonLAB.lab04;



public class Feline extends Mammal {
	private boolean spots;
public Feline(double weight,int getstation,boolean spots) {
	super(weight,getstation);
	this.spots = spots;
}
public Feline() {
	super();
	this.spots = true;
}
public void climb() {
	
}
public boolean isSpots() {
	return spots;
}
public void setSpots(boolean spots) {
	this.spots = spots;
}
}
