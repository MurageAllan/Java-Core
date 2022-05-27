package recap1;

import java.util.Objects;

public class Flamingoe extends Bird implements Information {
	private int age;
	private String name;
	

	@Override
	void fly() {
		System.out.println("The flamingoe can fly fast.");

	}

	@Override
	void feathers() {
		System.out.println("The flamingoe has beautiful feathers. ");

	}

	@Override
	void beak() {
		System.out.println("The flamingoe's beak is medium in size.");

	}

	@Override
	public void info() {
		System.out.println("Generally a flamingoe is mostly found in water.");

	}

	public Flamingoe(int age, String name) {
		super.age = age;
		super.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(age, name);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Flamingoe other = (Flamingoe) obj;
		return age == other.age && Objects.equals(name, other.name);
	}

	public String toString() {
		return String.format("%d , %s", age, name);
	}

}
