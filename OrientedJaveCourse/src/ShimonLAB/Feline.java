package ShimonLAB;

public class Feline extends Mammal {
	boolean spots;
public Feline(double weight,int getstation,boolean spots) {
	super(weight,getstation);
	this.spots = spots;
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
