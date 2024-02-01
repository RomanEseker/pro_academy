package home.work.HM1;

public class Veterinarian {
	private String name;

	public Veterinarian(String name) {
		super();
		this.name = name;
	}

	public Veterinarian() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void tretment(Animal animal) {
		System.out.println(this.getClass().getSimpleName() + " treats " + animal.getClass().getSimpleName());
	}

	@Override
	public String toString() {
		return "Veterinarian [name=" + name + "]";
	}
	
	

}
