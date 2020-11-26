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
			String[] sArr = c.prefixMatch(country);
			for(String str : sArr) {
				if(c.exactMatch(str) != null) {
					System.out.println("The capital of " + str + " is " + c.exactMatch(str));
				}
			}
		}
		System.out.println("Good bye!");
		s.close();

}
	
	
}