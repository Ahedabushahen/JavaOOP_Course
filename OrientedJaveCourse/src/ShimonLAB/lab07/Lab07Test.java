package ShimonLAB.lab07;



import java.io.FileNotFoundException;

public class Lab07Test {

	public static void main(String[] args) throws FileNotFoundException {
		
		  Cities cities = new Cities();
	      cities.listByDensity();
	      cities.listByPopulation();
	      cities.listAlphabetically();
	      cities.listByCountry( "China" );
	}

}
