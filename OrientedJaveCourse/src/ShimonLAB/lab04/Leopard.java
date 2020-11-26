package ShimonLAB.lab04;



public class Leopard extends Feline {
	private int mates;
public Leopard(double weight,int getstation,boolean spots,int mates) {
	super(weight,getstation,spots);
	this.mates = mates;
}
public Leopard() {
	super();
	this.mates = 3;
}
public void roar() {
	
}
public void prey() {
	
}
public int getMates() {
	return mates;
}
public void setMates(int mates) {
	this.mates = mates;
}

}
