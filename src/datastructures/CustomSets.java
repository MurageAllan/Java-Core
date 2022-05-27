package datastructures;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class CustomSets {

	public static void main(String[] args) {
		Person p1 = new Person("Allan", 20);
		Person p2 = new Person("Masha", 20);
		Person p3 = new Person("Kariuki", 21);
		Person p4 = new Person("Moreh", 22);
		Person p5 = new Person("Rober", 23);
		Set<Person> set1 = new HashSet<>();// No standard order.
		Set<Person> set2 = new LinkedHashSet<>(); // follows a standard order
		Set<Person> set3 = new TreeSet<>(); // follows a natural order.
		set1.add(p1);
		set1.add(p2);
		set1.add(p3);
		set1.add(p4);
		set1.add(p5);
		System.out.println(set1);
		
		Map<Person, String> map1 = new LinkedHashMap<>();
		
		map1.put(p1, "Young");
		map1.put(p2, "young");
		map1.put(p3, "old");
		map1.put(p4, "older");
		map1.put(p5, "oldest");
		String text = map1.get(p2); // getting the value for the key
		System.out.println(text);
		for(Map.Entry<Person,String> entry :  map1.entrySet()) {
			Person key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + " " + value);
		}
		for(Person key : map1.keySet()) {
			String value = map1.get(key);
			System.out.println(key + " "+ value);
		}
	}


}

class Person {
	private String name;
	private int age;

	public Person(String name, int age) {
		this.age = age;
		this.name = name;
	}

	public String toString() {

		return String.format("%d , %s", age, name);
	}
}
