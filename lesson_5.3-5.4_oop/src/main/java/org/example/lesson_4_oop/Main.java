package org.example.lesson_4_oop;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(Gender.MALE, "Roman", "Adamson", 1);
        Student student2 = new Student(Gender.FEMALE, "Anna", "Simpson", 2);
        Student student3 = new Student(Gender.FEMALE, "Natalya", "Dapper", 3);

        Group group1 = new Group("Group A");

        try {
            group1.addStudent(student1);
            group1.addStudent(student2);
            group1.addStudent(student3);
//          CreatingStudentByKeyBoard.createStudentByKeyBoard(group1);
        } catch (GroupOverflowException e) {
            e.printStackTrace();
        }

//        try {
//            System.out.println(group1.searchStudentByLastName("Adamson"));
//            System.out.println();
//
//        } catch (StudentNotFoundException e) {
//            e.printStackTrace();
//        }

        //System.out.println(group1.removeStudentByID(3));
        //System.out.println(group1);

//        group1.sortStudentsByLastName();

//        System.out.println();
//        System.out.println(student1.toCSVString());

//        System.out.println(student1.fromCSVString(student1.toCSVString()));

        File file1 = new File("./group.txt");

        group1.saveGroupToFile(file1);

        System.out.println(group1.loadGroupFromFile(file1));



    }
}
