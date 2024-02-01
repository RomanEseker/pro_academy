package test.com;


public class Company {

	private String comanyName;
	private Employee[] employesArray = new Employee[5];

	public Company(String comanyName) {
		super();
		this.comanyName = comanyName;
	}

	public Company() {
		super();
	}

	public String getComanyName() {
		return comanyName;
	}

	public void setComanyName(String comanyName) {
		this.comanyName = comanyName;
	}

	public Employee[] getEmployesArray() {
		return employesArray;
	}

	public void setEmployesArray(Employee[] employesArray) {
		this.employesArray = employesArray;
	}

	public boolean add(Employee employee) {
		for (int i = 0; i < employesArray.length; i++) {
			if (employesArray[i] == null) {
				employesArray[i] = employee;
				return true;
			}
		}
		return false;
	}

	public Employee searchById(int id) {
		for (int i = 0; i < employesArray.length; i++) {
			if (employesArray[i] != null && employesArray[i].getId() == id) {
				return employesArray[i];
			}
		}
		return null;
	}

	@Override
	public String toString() {
		String result = "Company [comanyName=" + comanyName + ", employesArray=";
		for (int i = 0; i < employesArray.length; i++) {
			if (employesArray[i] != null) {
				result += employesArray[i].toString() + ", ";
			}
		}
		result += "]";
		return result;
	}

}
