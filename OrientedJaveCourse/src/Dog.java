
public class Dog extends Animal {
	
	private String type;
	private String name;
	private boolean isNatural;
	
	public Dog(int weight,int height,String color,int mp,int mn,String type,String name, boolean isNatural) {
		super(weight,height,color);
		this.type = type +"";
		this.name = name +"";
		this.isNatural = isNatural;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isNatural() {
		return isNatural;
	}

	public void setNatural(boolean isNatural) {
		this.isNatural = isNatural;
	}

	public void eat(String food) {
		System.out.println(name + "i have eaten:"+food);
		
	}

	public void drink(String drink) {
		System.out.println("i have drank:"+drink);
		
	}

	public boolean hasEaten() {
		return false;
	}
	

}
