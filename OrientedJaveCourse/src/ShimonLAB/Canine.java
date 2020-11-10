package ShimonLAB;

public class Canine extends Mammal{
	public boolean vac;
	
public Canine(double weight,int getstation,boolean vac) {
	super(weight,getstation);
	this.vac = vac;
}
public void wail() {
}
public boolean isVac() {
	return vac;
}
public void setVac(boolean vac) {
	this.vac = vac;
}
}

