package recap1;

public class Ostrich extends Bird implements Information{

	@Override
	void fly() {
		System.out.println("The ostrich canot fly");
		
	}

	@Override
	void feathers() {
		System.out.println("The ostrich has rough feathers.");
		
	}

	@Override
	void beak() {
		System.out.println("The ostrich's beak is long. ");
		
	}

	@Override
	public void info() {
		System.out.println("Generally an ostrich is huge and has a tall neck   ");
		
	}
	

}
