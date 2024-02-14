package org.example.lesson_4_oop;

public class StudentNotFoundException extends Exception{
    public StudentNotFoundException() {
        super();
    }

    public StudentNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public StudentNotFoundException(String message) {
        super(message);
    }

    public StudentNotFoundException(Throwable cause) {
        super(cause);
    }
}
