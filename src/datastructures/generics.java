package datastructures;

import java.util.ArrayList;
import java.util.List;

public class generics {

	public static void main(String[] args) {
		List<Machine> list1 = new ArrayList<>();
		list1.add(new Machine("Alonso", 6));
		list1.add(new Machine("Andy", 8));
		loopThrough(list1);
		List<Camera> list2 = new ArrayList<>();
		list2.add(new Camera());
		list2.add(new Camera());
		loopThrough(list2);
	}

	public static void loopThrough(List<? extends Machine> list) {
		for (Object value : list) {
			System.out.println(value);
		}
	}

}

class Machine {
	protected int age;
	protected String name;

	public Machine(String name, int age) {
		this.age = age;
		this.name = name;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("This machines name is ").append(name).append(" and it is ").append(age).append(" year old");
		return sb.toString();
	}

}

class Camera extends Machine {
	public Camera() {
		super("Andy", 7);
	}

	public String toString() {
		return String.format("This cameras name is %s and it is a %d year old", name, age);
	}
}
