package ShimonLAB.lab07;

import java.util.Comparator;

public class CompareByDensity implements Comparator<City> {

	@Override
	public int compare(City o1, City o2) {
		double density1 = (double) o1.getPopulation() / (double) o1.getArea();
		double density2 = (double) o2.getPopulation() / (double) o2.getArea();
		if(density1 < density2) {
			return -1;
		}
		else if (density1 > density2) {
			return 1;
		}
		else
			return 0;
	}

}
