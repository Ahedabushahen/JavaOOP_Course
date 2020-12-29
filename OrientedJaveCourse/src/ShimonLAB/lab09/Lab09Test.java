package ShimonLAB.lab09;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/** disclaimer,
 * sorry Lior, i didnt have much time to work on this lab although it was till sunday's night.
 * im very sorry for making you even check this, i just had a rough time understanding the task, and lot of midterms test 
 * to prepare to,
 *my bad.
 * wont happen again, at least ill try it wont.
 *
 * 
 *
 */
public class Lab09Test {
	public static void main(String[] args) throws FileNotFoundException, NumberFormatException, OverStockException, OutOfStockException {
		File file = new File(args[0]);
		Scanner scan = new Scanner(file);
		StoreHouse storehouse = new StoreHouse();
		while(scan.hasNextLine()) {
			String[] input = scan.nextLine().split(" +");
			switch(input[0]) {
			case "define":
				storehouse.define(new Product(input[0], Integer.parseInt(input[1])),Integer.parseInt(input[1]));
				break;
			case "order":
				storehouse.order(new Product(input[0], Integer.parseInt(input[1])),Integer.parseInt(input[1]));
				break;
			case "supply":
				storehouse.supply(new Product(input[0], Integer.parseInt(input[1])),Integer.parseInt(input[1]));
			default:
				System.out.println("wrong input");
				break;
			}
		}
		scan.close();
	}
}
