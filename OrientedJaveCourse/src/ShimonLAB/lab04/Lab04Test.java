package ShimonLAB.lab04;



public class Lab04Test {

	public static void main(String[] args) {
		Dog d = new Dog(2.15,1,true,"rocky",3);
		Cat cat = new Cat();
		Leopard l = new Leopard();
		System.out.println(cat.getGestation());
	    System.out.println(d.getGestation());
	    System.out.println(l.getGestation());
	}

}
