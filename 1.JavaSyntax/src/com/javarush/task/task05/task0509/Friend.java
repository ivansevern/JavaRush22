package com.javarush.task.task05.task0509;

/*
Создать класс Friend
*/

public class Friend {
    //write this code
    public String name;       //заполняю класс
    public int age;
    public char sex;

    public void initialize(String name){    //создаю инициализатор
        this.name = name;
    }

    public void initialize(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void initialize(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public static void main(String[] args) {
    }
}
