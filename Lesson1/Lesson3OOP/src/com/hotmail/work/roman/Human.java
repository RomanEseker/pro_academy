package com.hotmail.work.roman;

public class Human {
	Gender gender;
	private String name;
	private String lastname;

	public Human() {
		super();
	}

	public Human(Gender gender, String name, String lastname) {
		super();
		this.gender = gender;
		this.name = name;
		this.lastname = lastname;
	}

	public Gender getGender() {
		return gender;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	@Override
	public String toString() {
		return "Human [gender=" + gender + ", name=" + name + ", lastname=" + lastname + "]";
	}
	

}
