package datastructures;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Maps {

	public static void main(String[] args) {
		Map<Movie, String> map1 = new HashMap<>();
		Map<Movie, String> map2 = new LinkedHashMap<>();
		Map<Movie, String> map3 = new TreeMap<>();
		movieMethod(map1);
	}
	public static void movieMethod(Map<Movie, String> map) {
		Movie mv1 = new Movie(2012, "Fauda");
		Movie mv2 = new Movie(2013, "Stranger Things");
		Movie mv3 = new Movie(2011, "Everything Everything");
		Movie mv4 = new Movie(2020, "Ginny and Georgia");
		Movie mv5 = new Movie(2010, "Knight");
		Movie mv6 = new Movie(2008, "The hate that you give");
		map.put(mv1, "Tobby Robson");
		map.put(mv2, "Diego pablo");
		map.put(mv3, "Tom Clancys");
		map.put(mv4, "Jack Ryan");
		map.put(mv5, "Amandla Stenberg");
		map.put(mv6, "Chris Rock");
		for(Movie key : map.keySet()) {
			String value = map.get(key);
			System.out.println(key + "," + value);
		}
		
	}
	public static void 
}

class Movie {
	private String name;
	private int date;

	public Movie(int date, String name) {

		this.date = date;
		this.name = name;
	}
	public String toString() {
		return String.format("%s : %d", name, date);
	}
}
class Series extends Movie{

	public Series(int date, String name) {
		super(date, name);
		
	}
	
}
