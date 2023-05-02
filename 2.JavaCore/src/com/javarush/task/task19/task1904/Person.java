package com.javarush.task.task19.task1904;

import java.util.Date;

public class Person {
    private String firsName;
    private String middleName;
    private String lastName;
    private Date birthDate;

    public Person(String firsName, String middleName, String lastName, Date birthDate) {
        this.firsName = firsName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %s", lastName, firsName, middleName, birthDate.toString());
    }
}