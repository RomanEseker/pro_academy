package home.work.HM1;

public class Cat extends Animal {
	private String name;

	public Cat(String ration, String color, int weight, String name) {
		super(ration, color, weight);
		this.name = name;
	}

	public Cat() {
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
		return this.getClass().getSimpleName()  + " meows.";
	}
	
	@Override
	public void eat() {
		System.out.println(this.getClass().getSimpleName() + " is eating a bite.");
	}
	
	@Override
	public void sleep() {
		System.out.println(this.getClass().getSimpleName() + " is asleep.");
	}

}
