package ShimonLAB;

public class Cat extends Feline{
	public boolean spayed;
public Cat(double weight,int getstation,boolean spots,boolean spayed) {
		super(weight,getstation,spots);
		this.spayed = spayed;
}
public void scartch() {
	
}
public boolean isSpayed() {
	return spayed;
}
public void setSpayed(boolean spayed) {
	this.spayed = spayed;
}
}
