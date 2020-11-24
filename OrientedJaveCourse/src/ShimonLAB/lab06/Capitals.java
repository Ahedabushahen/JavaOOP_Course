package ShimonLAB.lab06;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.*;
public class Capitals {
	public Map<String, String> map;
	public File capitals;
	public Capitals() throws FileNotFoundException{
		map = new HashMap<String, String>();
		File capitals = new File("capitals.txt");
		Scanner scanner = new Scanner(capitals);
			scanner.useDelimiter("[;\n]");
		      while (scanner.hasNextLine()) {
		    	  String countery = scanner.next();
		    	  String city = scanner.next();
		    	  map.put(countery, city);
		      }
		      scanner.close();
		      
		     
	}

public String exactMatch(String country) {
	if(!(this.map.containsKey(country))) {
		return null;
	}
	return this.map.get(country);
}

public String[] prefixMatch(String prefix) {
	ArrayList<String> countery_list = new ArrayList<String>();
	for(String key : map.keySet()) {
		 if(key.toLowerCase().startsWith(prefix.toLowerCase())) {
			 countery_list.add(key);
		 }
	
}
	String[] countery_arr = new String[countery_list.size()];
	countery_arr = countery_list.toArray(countery_arr);

	return countery_arr;

}

}





	
