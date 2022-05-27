package file;

import java.io.Serializable;

public class Person implements Serializable {
	private static final long serialVersionUID = -3971140018486467345L;
	private transient int age; // transient keyword prevents serialization of fields.
	private String name;
	private static int count; // static fields are not serializable because there's no need to save a value
								// belonging to the class and not object.

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Person.count = count;
	}

	public Person(int age, String name) {
		this.name = name;
		this.age = age;
	}

	public String toString() {
		return String.format("%s , %d" + " count is." + count, name, age);
	}
}
