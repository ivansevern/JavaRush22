package com.javarush.task.task05.task0510;

/*
Кошкоинизация
*/

public class Cat {
    //write this code
    public String name;
    public int age;
    public int weight;
    public String address;
    public String color;

    public void initialize(String name) { //Имя
        this.name = name;    //тут 1 инициализатор
        this.age = 1;        //остальным присваиваем значения
        this.weight = 1;
        this.color = "Black";
    }

    public void initialize(String name, int age, int weight) { //Имя, вес, возвраст
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = "Black";
    }

    public void initialize(String name, int age) { //Имя, возвраст (вес стандартный)
        this.name = name;
        this.age = age;
        this.weight = 1;
        this.color = "Black";
    }

    public void initialize(int weight, String color) { //вес, цвет (имя, адресс и возвраст неизвестны, это бездомный кот)
        this.weight = weight;
        this.color = color;
        this.age = 1;
    }

    public void initialize(String color, String address, int weight) { //вес, цвет, адрес (чужой домашний кот)
        this.weight = weight;
        this.address = address;
        this.color = color;
        this.age = 1;
    }
}
