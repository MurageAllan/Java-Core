package recap1;

import java.util.Objects;

public abstract class Bird {
	protected int age;
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	protected String name;
	private int ID;

	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bird other = (Bird) obj;
		return age == other.age && Objects.equals(name, other.name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	abstract void fly();

	abstract void feathers();

	abstract void beak();

	public void run() {
		fly();
		feathers();
		beak();
	}

}
