package datastructures;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.SortedSet;
import java.util.TreeSet;

class Personal implements Comparable<Personal> {
	private String name;

	public Personal(String name) {
		this.name = name;

	}
	public String toString() {
		return name;
	}
	@Override
	public int hashCode() {
		return Objects.hash(name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Personal other = (Personal) obj;
		return Objects.equals(name, other.name);
	}
	@Override
	public int compareTo(Personal person) {
		int len1 = name.length();
		int len2 = person.name.length();
		if(len1 > len2) {
			return 1;
		}else if(len1 < len2) {
			return -1;
		}else {
			return 0;
		}
		
	}
	
}

public class Ordering {

	public static void main(String[] args) {
		List<Personal> list = new ArrayList<>();
		SortedSet<Personal> set = new TreeSet<>();
		addElements(list);
		addElements(set);

		Collections.sort(list);

		showElements(list);
		System.out.println("\n");
		showElements(set);

	}

	public static void addElements(Collection<Personal> col) {
		col.add(new Personal("Allan"));
		col.add(new Personal("masha"));
		col.add(new Personal("Jere"));
		col.add(new Personal("mercy"));
		col.add(new Personal("Brayo"));
		col.add(new Personal("ley"));

	}

	public static void showElements(Collection<Personal> loop) {
		for (Personal text : loop) {
			System.out.println(text);
		}
	}
}
