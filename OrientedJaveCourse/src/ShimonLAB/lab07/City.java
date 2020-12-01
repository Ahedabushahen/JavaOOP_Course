package ShimonLAB.lab07;

public class City  implements Comparable<City>{
	private String name;
	private String country;
	private int population;
	private int area;
	
	public City(String name,String country,int population,int area) {
		this.name = name;
		this.country = country;
		this.population = population;
		this.area = area;
	}
	@Override
	public int compareTo(City c) {
		return this.name.compareTo(c.getName());
	}
	public String getName() {
		return name;
	}
	public String getCountry() {
		return country;
	}
	public int getPopulation() {
		return population;
	}
	public int getArea() {
		return area;
	}
	

}
