package test.com;

public class Main {

	public static void main(String[] args) {
		Person person1 = new Person("Roman", "Romanov");
//		System.out.println(person1.toString());

		Employee employee1 = new Employee("Ivan", "Ivanov", "developer", 15);
//		System.out.println(employee1.toString());
		

		Development development1 = new Development("Andrey", "Andreev", "developer", 10, "java");
		Company company = new Company("TerraSoft");
		company.add(development1);
		
		Employee em = company.searchById(20);
		System.out.println(em);
		
		System.out.println(company.toString());
//		System.out.print(development1.toString());
		
		//System.out.println(getLastName(employee1));
		
		//Person person = employee1; // в персонал можна неявно впихнуть сотрудника/ доступны методы персоны
		//Development dev = person1; // не можно в разработчика впихнуть персонал. теряются данные.

//		Employee employee2 = (Employee) person1;



	}

	public static String getLastName(Person person) {
		return person.getLastName();
		
	}
}
