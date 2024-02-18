package org.example.lesson_4_oop;

import java.util.Scanner;

public class CreatingStudentByKeyBoard {

    static void createStudentByKeyBoard(Group group) throws GroupOverflowException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter gender of human (MALE, FEMALE): ");
        String gender = scanner.nextLine().toUpperCase();

        System.out.println("Enter name of student: ");
        String name = scanner.nextLine();

        System.out.println("Enter last name of student: ");
        String lastName = scanner.nextLine();

        Student student = new Student();
        student.setGender(Gender.valueOf(gender));
        student.setName(name);
        student.setLastName(lastName);
        student.setId(group.getMaxStudentId() + 1);

        group.addStudent(student);

        System.out.println(group);
    }
}
