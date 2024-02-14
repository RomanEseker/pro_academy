package org.example.lesson_4_oop;

import java.util.Arrays;
import java.util.Comparator;

public class Group {
    private String groupName;
    private Student[] students = new Student[10];

    public Group(){
    }

    public Group(String groupName) {
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
        for (Student student : students) {
            if (student != null) {
                if (student.getLastName().equals(lastName)) {
                    return student;
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

    @Override
    public String toString() {
        boolean isSorted = false;
        Student[] studentsArray = new Student[1];
        String text = "";

        while (!isSorted) {
            isSorted = true;

            for (int i = 1; i < students.length; i++) {
                if (students[i] != null && students[i - 1] != null) {
                    if ((students[i].getLastName().compareTo(students[i - 1].getLastName())) < 0) {
                        studentsArray[0] = students[i];
                        students[i] = students[i - 1];
                        students[i - 1] = studentsArray[0];
                        isSorted = false;
                    }
                }
            }

        }
        for (Student student : students) {
            if (student != null) {
                text += "Student={" + "id='" + student.getId() + '\''
                        + ", gender='" + student.getGender() + '\''
                        + ", lastName='" + student.getLastName() + '\''
                        + ", name='" + student.getName() + '\''
                        + ", group='" + student.getGroupName() + '\'' + "}" + "\n";
            }
        }
        return text;
    }

    public void sortStudentsByLastName(){
       Arrays.sort(students, Comparator.nullsLast(new LastNameComparator()));
       for(Student student : students){
           if(student != null){
               System.out.println("Student={" + "id='" + student.getId() + '\''
                       + ", gender='" + student.getGender() + '\''
                       + ", lastName='" + student.getLastName() + '\''
                       + ", name='" + student.getName() + '\''
                       + ", group='" + student.getGroupName() + '\'' + "}");
           }
       }
    }

    public int getMaxStudentId(){
        int value = students[0].getId();
        for(int i = 1; i < students.length; i++){
            if(students[i] != null){
              if(students[i].getId() > value){
                  value = students[i].getId();
              }
            }
        }
        return value;
    }
}
