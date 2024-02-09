package com.hotmail.work.roman;

public class Group {
	private String groupName = "zalupa";
	Student[] students = new Student[10];

	public Group() {
		super();
	}

	public Group(String groupName) {
		super();
		this.groupName = groupName;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public Student[] getStudents() {
		return students;
	}

	public void setStudents(Student[] students) {
		this.students = students;
	}

	public void addStudent(Student student) throws GroupOverflowException {
		for (int i = 0; i < students.length; i++) {
			if (students[i] == null) {
				students[i] = student;
				student.setGroupName(getGroupName());
				return;
			}
		}
		throw new GroupOverflowException("The group is overfull");
	}

	public Student searchStudentByLastName(String lastName) throws StudentNotFoundException {
		for (int i = 0; i < students.length; i++) {
			if (students[i] != null) {
				if (students[i].getLastname() == lastName) {
					return students[i];
				}
			}
		}
		throw new StudentNotFoundException("Student is not exist.");
	}

	public boolean removeStudentByID(int id) {
		for (int i = 0; i < students.length; i++) {
			if (students[i] != null) {
				if (students[i].getId() == id) {
					students[i] = null;
					return true;
				}
			}
		}
		return false;
	}

	public String toString() {
		boolean isSorted = false;
		Student[] studentsArray = new Student[1];
		String text = "";

		while (!isSorted) {
			isSorted = true;

			for (int i = 1; i < students.length; i++) {
				if (students[i] != null && students[i - 1] != null) {
					if ((students[i].getLastname().toString()
							.compareTo(students[i - 1].getLastname().toString())) < 0) {
						studentsArray[0] = students[i];
						students[i] = students[i - 1];
						students[i - 1] = studentsArray[0];
						isSorted = false;
					}
				}
			}
			
		}
		for (int i = 0; i < students.length; i++) {
			if (students[i] != null) {
				text+= "Student=[" + "id=" + students[i].getId() + ", lastName=" + students[i].getLastname()
						+ ", name=" + students[i].getName() + ", group=" + students[i].getGroupName() + "]" + "\n";
			}
		}
		return text;
	}
}
