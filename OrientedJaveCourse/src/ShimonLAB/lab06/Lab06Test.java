package ShimonLAB.lab06;
import java.util.Scanner;

import java.io.FileNotFoundException;

public class Lab06Test {
	Scanner s;
	public static void main(String[] args) throws FileNotFoundException {
		Capitals c = new Capitals();
		String country = "";
		Scanner s = new Scanner(System.in);
		while(!(country.equals("end"))) {
			System.out.print("Enter a country name (\"end\" to exit): ");
			if(s.hasNext()){
				country = s.nextLine();
			}
			country = Character.toUpperCase(country.charAt(0)) + country.substring(1);
			System.out.println(country);
			if(c.exactMatch(country) != null)
				System.out.println("The capital of " + country + " is " + c.exactMatch(country));
		}
		System.out.println("Good bye!");
		s.close();
}
	
	
	
}