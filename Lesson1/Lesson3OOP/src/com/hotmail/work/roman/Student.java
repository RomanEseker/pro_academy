package com.hotmail.work.roman;

public class Student extends Human {
	private int id;
	private String groupName;

	public Student() {
		super();
	}

	public Student(Gender gender, String name, String lastname, int id) {
		super(gender, name, lastname);
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	@Override
	public String toString() {
		return "Student [id=" + id 
				+ ", lastname=" + getLastname()
				+ ", fistname=" + getName()
				+ ", groupName=" + groupName 
				+ "]";
	}
	

	
}
