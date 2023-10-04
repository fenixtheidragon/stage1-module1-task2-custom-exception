package com.epam.mjc;


import java.util.Arrays;

public class StudentManager {

    private static final long[] IDs = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

    public static void main(String[] args) throws StudentIDNotFoundException {
        StudentManager manager = new StudentManager();

        for (long i : IDs) {
            try {
                Student student = manager.find(i);
                System.out.println("Student name " + student.getName());
            } catch (StudentIDNotFoundException e) {
                System.out.println(e);
            }
        }

    }

    public Student find(long studentID) throws StudentIDNotFoundException {
        if (Arrays.stream(IDs)
                .filter(a->a>0&&a<11)
                .filter(a->a==studentID)
                .findFirst()
                .isPresent()) {
            return Student.getValueOf(studentID);
        } else {
            throw new StudentIDNotFoundException(String.valueOf(studentID));
        }
    }
}