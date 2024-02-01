package test.com;

public class Employee extends Person{
	
	private int id;
	private String departmnet;
	
	public Employee(String firstName, String lastName, String position, int id) {
		super(firstName, lastName);
		this.departmnet = position;
		this.id = id;
	}

	public Employee() {
		super();
	}



	public String getDepartment() {
		return departmnet;
	}

	public void setPosition(String position) {
		this.departmnet = position;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", departmnet=" + departmnet + ", id="
				+ getId() + ", firstName=" + getFirstName() + ", lastName=" + getLastName() + "]";
	}

	
	
	

}
