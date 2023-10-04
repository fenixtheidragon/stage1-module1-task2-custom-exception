package com.epam.mjc;

public class StudentIDNotFoundException extends IllegalArgumentException{
    public StudentIDNotFoundException(String s) {
        super("Could not find student with ID " + s);
    }
}
