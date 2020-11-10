package ShimonLAB;

public class Dog extends Canine{
	public String name;
	public int fleas;
public Dog(double weight,int getstation,boolean vac,String name, int fleas){
	super(weight, getstation, vac);
	this.name = name;
	this.fleas = fleas;
}
}
