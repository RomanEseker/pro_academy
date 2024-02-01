package home.work.HM1;

public class Main {

	public static void main(String[] args) {
		Animal animal1 = new Animal("24/7", "black", 60);
		animal1.eat();
		animal1.sleep();
		System.out.println(animal1.getVoice());
		System.out.println();
		
		
		Cat cat1 = new Cat("24/7", "white", 4, "Black");
		cat1.eat();
		cat1.sleep();
		System.out.println(cat1.getVoice());
		System.out.println();
		
		
		Dog dog1 = new Dog("24/7", "black", 20, "Rex");
		dog1.eat();
		dog1.sleep();
		System.out.println(dog1.getVoice());
		System.out.println();


		Veterinarian veterinarian1 = new Veterinarian("Steav");
		veterinarian1.tretment(animal1);
		veterinarian1.tretment(cat1);
		veterinarian1.tretment(dog1);
	}

}
