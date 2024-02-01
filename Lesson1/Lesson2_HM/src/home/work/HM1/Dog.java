package home.work.HM1;

public class Dog extends Animal{
	private String name;

	public Dog(String ration, String color, int weight, String name) {
		super(ration, color, weight);
		this.name = name;
	}

	public Dog() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String getVoice() {
		return this.getClass().getSimpleName()  + " bark.";
	}
	
	@Override
	public void eat() {
		System.out.println(this.getClass().getSimpleName() + " is eating much.");
	}
	
	@Override
	public void sleep() {
		System.out.println(this.getClass().getSimpleName() + " is asleep.");
	}
	

}
