import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// storehouse.txt
public class Lab09Test {
	public static void main(String[] args) throws FileNotFoundException {
		File file = new File(args[0]);
		Scanner scan = new Scanner(file).useDelimiter("\n");
		String[] line = null;
		while(scan.hasNext()) {
			line = scan.nextLine().split("\\s++");
			System.out.println(line);
		}
		
	}
}
