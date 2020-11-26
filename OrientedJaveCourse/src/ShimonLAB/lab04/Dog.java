package ShimonLAB.lab04;



public class Dog extends Canine{
	private String name;
	private int fleas;
	
public Dog(double weight,int getstation,boolean vac,String name, int fleas){
	super(weight, getstation, vac);
	this.name = name;
	this.fleas = fleas;
}
public Dog(String name){
	super();
	this.name = name;
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
