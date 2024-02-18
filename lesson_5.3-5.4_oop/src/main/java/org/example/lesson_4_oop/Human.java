package org.example.lesson_4_oop;

public class Human {
    Gender gender;
    private String name;
    private String lastName;

    public Human() {
    }

    public Human(Gender gender, String name, String lastName) {
        this.gender = gender;
        this.name = name;
        this.lastName = lastName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Human{" +
                "gender=" + gender +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
