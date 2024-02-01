package test.com;

public class Development extends Employee {
	private String skill;

	public Development(String firstName, String lastName, String position, int id, String skill) {
		super(firstName, lastName, position, id);
		this.skill = skill;
		setId(id);
	}

	public Development() {
		super();
	}

	public Development(String firstName, String lastName, String position, int id) {
		super(firstName, lastName, position, id);
		// TODO Auto-generated constructor stub
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	@Override
	public void setId(int id) {
		id = (id / 10) * 10;
		super.setId(id);
	}

	@Override
	public String toString() {
		return "Development [skill=" + skill + ", " + super.toString()
				+ ", firstName=" + getFirstName() + ", lastName=" + getLastName() + "]";
	}

}
