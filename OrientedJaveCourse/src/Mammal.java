
public abstract  class Mammal extends Animal { // abstract class!! cannot create instance!
											   // any extending classes methods must use abstract methods
	
	protected int milkProduction;
	protected int milkNeeded;
	
	public Mammal(int weight,int height, String color,int mp,int mn) {
		super(weight,height,color);
		this.milkProduction = mp;
		this.milkNeeded = mn;
	
	}

	public int getMilkProduction() {
		return milkProduction;
	}

	public void setMilkProduction(int milkProduction) {
		this.milkProduction = milkProduction;
	}

	public int getMilkNeeded() {
		return milkNeeded;
	}

	public void setMilkNeeded(int milkNeeded) {
		this.milkNeeded = milkNeeded;
	}

}
