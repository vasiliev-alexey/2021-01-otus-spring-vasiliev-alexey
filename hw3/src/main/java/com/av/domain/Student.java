package com.av.domain;

public class Student {

    private String firstName;
    private String lastName;

    @Override
    public String toString() {
        return String.format("%s %s", firstName, lastName);
    }

    public Student(final String firstName, final String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
