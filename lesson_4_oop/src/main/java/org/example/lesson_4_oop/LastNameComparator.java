package org.example.lesson_4_oop;

import java.util.Comparator;

public class LastNameComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Student student1 = (Student) o1;
        Student student2 = (Student) o2;

        String lastName1 = student1.getLastName();
        String lastName2 = student2.getLastName();

        if(lastName1.compareTo(lastName2) > 0){
            return 1;
        }

        if(lastName1.compareTo(lastName2) < 0){
            return -1;
        }
        return 0;
    }
}
