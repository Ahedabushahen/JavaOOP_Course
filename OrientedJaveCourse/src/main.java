public class main{
	public static void main(String[] args){
		Car c1 = new Car(); //new car instance
		Car c2 = new Car(50000,7,250,"red","Honda");
		Car c3 = new Car(7000,6,200,"grey","Toyota");
		Animal B = new Dog(20,40,"white",6,7,"Husky","Batz",true); // Polymorphism
		Dog Batz = new Dog(20,40,"white&black",6,7,"Husky","Batz",true);
		Batz.eat("bunzo");
		Node<Integer> intNode = new Node<Integer>();
		Node<String> StringNode = new Node<String>();
		intNode.setInfo(3);
		StringNode.setInfo("Asaf");
		((Dog)B).getType(); // Polymorphism, B is a type of animal , there4 we will use ((dog)) to use methods of dog
}	
}
