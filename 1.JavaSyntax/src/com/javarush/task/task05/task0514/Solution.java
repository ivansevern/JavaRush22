package com.javarush.task.task05.task0514;

/*
Программист создает человека
*/

public class Solution {
    public static void main(String[] args) {
        //write this code
        Person person = new Person();             //создаю объект
        person.initialize("Ivan", 37);  //вызываю со значениями
    }

    static class Person {
        //write this code
        String name;
        int age;

        public void initialize(String name, int age) { //инициализирую переменные
            this.name = name;
            this.age = age;
        }
    }
}
