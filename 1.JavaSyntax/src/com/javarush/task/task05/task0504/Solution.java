package com.javarush.task.task05.task0504;
//TODO: конструктор для класса
/*
Трикотаж
*/

public class Solution {
    public static void main(String[] args) {
        //write this code
        Cat cat1 = new Cat("Tom", 2, 2, 2); //создаю кота1 по шаблону класса с параметрами
        Cat cat2 = new Cat("Sam", 2, 2, 2);
        Cat cat3 = new Cat("Fiona", 3, 3, 3);

    }

    public static class Cat {
        private String name;
        private int age;
        private int weight;
        private int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }
    }
}
