package org.example.lesson_4_oop;

public interface CSVConverter {
    public String toCSVString();

    public Student fromCSVString(String str);
}
