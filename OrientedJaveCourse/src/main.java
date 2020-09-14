import java.util.Random;
import java.util.Scanner;

public class main{
	public static void main(String[] args){
		Car c1 = new Car(); //new car instance
		Car c2 = new Car(50000,7,250,"red","honda");
		System.out.println(c1.toString());
		System.out.println(c2.toString());
	}
}