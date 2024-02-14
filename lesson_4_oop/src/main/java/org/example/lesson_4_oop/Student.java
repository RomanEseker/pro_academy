package org.example.lesson_4_oop;


public class Student extends Human implements CSVConverter {
    private int id;
    private String groupName;

    public Student() {
    }

    public Student(Gender gender, String name, String lastName, int id) {
        super(gender, name, lastName);
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
        return "Student{" +
                "id=" + id +
                ", name='" + getName() + "'" +
                ", lastName='" + getLastName() + "'" +
                ", gender=" + gender + "'" +
                '}';
    }

    @Override
    public String toCSVString(){
        return  getId() + ";"
                + getName() + ";"
                + getLastName() + ";"
                + getGender() + ";";
    }

    @Override
    public Student fromCSVString(String str){
        String[] student = str.split(";");
        return new Student(Gender.valueOf(student[3]), student[1], student[2], Integer.parseInt(student[0]));
    }

}
