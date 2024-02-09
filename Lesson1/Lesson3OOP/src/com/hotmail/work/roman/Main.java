package com.hotmail.work.roman;

public class Main {

	public static void main(String[] args) {
		Student student1 = new Student(Gender.MALE, "Roman", "Aabca", 1);
		Student student2 = new Student(Gender.FEMALE, "Anna", "Aabc", 2);
		Student student3 = new Student(Gender.FEMALE, "Anna", "Aab", 3);

		Group group1 = new Group("Group A");

		try {
			group1.addStudent(student1);
			group1.addStudent(student2);
			group1.addStudent(student3);
		} catch (GroupOverflowException e) {
			e.printStackTrace();
		}

		try {
			System.out.println(group1.searchStudentByLastName("Aabc"));

		} catch (StudentNotFoundException e) {
			e.printStackTrace();
		}

		System.out.println(group1.removeStudentByID(0));
		System.out.println(group1.toString());
		

	}

}
