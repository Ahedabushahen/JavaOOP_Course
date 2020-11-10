package ShimonLAB;

public class Dog extends Canine{
	public String name;
	public int fleas;
public Dog(double weight,int getstation,boolean vac,String name, int fleas){
	super(weight, getstation, vac);
	this.name = name;
	this.fleas = fleas;
}
public void bark() {
	
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getFleas() {
	return fleas;
}
public void setFleas(int fleas) {
	this.fleas = fleas;
}
}
