package ShimonLAB.lab07;


import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Cities implements Comparator<City> {
	public SortedSet<City> cityList;
	
	public Cities() {
		cityList = new TreeSet<City>();
		String fileName = "cities.txt";
		this.init(fileName);
	}
	public void init(String fileName){
		String city = null,country = null;
		int population = 0,area = 0;
		File file = new File(fileName);
		Scanner scanner = null;
		try {
			scanner = new Scanner(file).useDelimiter("[\t\n]");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		while(scanner.hasNext()) {
			if(scanner.hasNext()) {
				city = scanner.next();
			}
			if(scanner.hasNext()) {
				country = scanner.next();
			}
			if(scanner.hasNextInt()) {
				population = scanner.nextInt();
			}
			if(scanner.hasNextInt()) {
				area = scanner.nextInt();
			}
			City c = new City(city,country,population,area);
			cityList.add(c);
		}
		scanner.close();
		
	}
	public void listAlphabetically() {
		System.out.println();
		System.out.println("City list");
		System.out.println();
		for(City c: this.cityList) {
			System.out.printf("%s(%s) population: %d area: %d\n",c.getName(),c.getCountry(),c.getPopulation(),c.getArea());
		
		}
		
		
	}
	public void listByPopulation() {
		System.out.println();
		System.out.println("City list by population");
		System.out.println();
		SortedSet<City> listByPopulation = new TreeSet<City>(this);
		for(City c: cityList)
			listByPopulation.add(c);
		for(City c: listByPopulation)
			System.out.printf("%s(%s) population: %d area: %d\n",c.getName(),c.getCountry(),c.getPopulation(),c.getArea());
		
	}
	public void listByDensity() {
		SortedSet<City> listByDensity = new TreeSet<City>(new CompareByDensity());
		System.out.println();
		System.out.println("City list by density");
		System.out.println();
		for(City c: cityList) {
			listByDensity.add(c);
		}
		for(City c: listByDensity) {
			System.out.printf("%s(%s) population: %d area: %d density: %d\n",c.getName(),c.getCountry(),c.getPopulation(),c.getArea(),c.getDensity());
		}
		
		
	
}
	public void listByCountry(String country) {
		System.out.println();
		System.out.println("Cities in " + country +":");
		System.out.println();
		for(City c: this.cityList) {
			if(c.getCountry().startsWith(country))
			System.out.printf("%s(%s) population: %d area: %d\n",c.getName(),c.getCountry(),c.getPopulation(),c.getArea());
		}
}
	@Override
	public int compare(City o1, City o2) {
		 return o2.getPopulation() - o1.getPopulation();
		
	}
	
	
}