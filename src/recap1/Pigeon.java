package recap1;

public class Pigeon extends Bird implements Information {

	@Override
	void fly() {
		System.out.println("This pigeon is flying.");
		
	}

	@Override
	void feathers() {
		System.out.println("This pigeon has smooth feathers.");
		
	}

	@Override
	void beak() {
		System.out.println("The pigeon's beak is short.");
		
	}

	@Override
	public void info() {
		System.out.println("A pigeon is a rare animal.");
		
	}
	static class Colour{
		public void complexion() {
			System.out.println("This pigeon is black in colour");
		}
	}

}
