package datastructures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sort {

	public static void main(String[] args) {
		List<Machine> cam = new ArrayList<>();
		cam.add(new Machine(7, "nikon"));
		cam.add(new Machine(8, "canon"));
		cam.add(new Machine(4, "Sony"));
		cam.add(new Machine(2, "Samsung"));

		for (Machine machine : cam) {
			System.out.println(machine);
		}
		Collections.sort(cam, new sortByIdentification());
		System.out.println("\n");

		for (Machine machine : cam) {
			System.out.println(machine);
		}
	}

}

class Machine {
	private String name;
	private int ID;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public Machine(int ID, String name) {
		this.ID = ID;
		this.name = name;
	}

	public String toString() {
		return String.format("%d , %s", ID, name);
	}
}

class sortByIdentification implements Comparator<Machine> {

	@Override
	public int compare(Machine m1, Machine m2) {
		if (m1.getID() > m2.getID()) {
			return 1;
		} else if (m1.getID() < m2.getID()) {
			return -1;
		} else {
			return 0;
		}
	}
}
