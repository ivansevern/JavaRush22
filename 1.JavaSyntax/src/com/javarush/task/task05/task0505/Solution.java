package com.javarush.task.task05.task0505;

/*
Кошачья бойня
*/

public class Solution {
    public static void main(String[] args) {
        //write this code
        Cat cat1 = new Cat("Tom", 2, 2, 2);  //создаю кота по шаблону с параметрами
        Cat cat2 = new Cat("Sam", 2, 2, 2);
        Cat cat3 = new Cat("Fiona", 3, 3, 3);

        System.out.println(cat1.fight(cat2));                          //1 бой кота1 с котом2
        System.out.println(cat2.fight(cat3));
        System.out.println(cat3.fight(cat1));
    }

    public static class Cat {

        protected String name;
        protected int age;
        protected int weight;
        protected int strength;


        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }

        public boolean fight(Cat anotherCat) {
            int ageCount = Integer.compare(this.age, anotherCat.age);
            int weightCount = Integer.compare(this.weight, anotherCat.weight);
            int strengthCount = Integer.compare(this.strength, anotherCat.strength);

            int count = ageCount + weightCount + strengthCount;
            return count > 0;  //return score >0 ? true : false;
        }
    }

}
