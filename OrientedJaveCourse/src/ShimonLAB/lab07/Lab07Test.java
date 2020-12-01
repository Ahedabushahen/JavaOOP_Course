package ShimonLAB.lab07;

import java.io.FileNotFoundException;

public class Lab07Test {

	public static void main(String[] args) throws FileNotFoundException {
		Cities s = new Cities();
		s.init("cities.txt");
		s.listByDensity();
	}

}
