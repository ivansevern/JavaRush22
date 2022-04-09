package com.javarush.task.task05.task0526;

/*
Мужчина и женщина
*/

public class Solution {
    public static void main(String[] args) {
        //write this code
        Man man1 = new Man("Ivan", 37, "Kaluga");
        Man man2 = new Man("Ivan", 39, "New-York");
        Woman woman1 = new Woman("1", 22, "22");
        Woman woman2 = new Woman("2", 23, "44");
        System.out.println(man1);
        System.out.println(man2);
        System.out.println(woman1);
        System.out.println(woman2);

    }
    //write this code
    public static class Man{
        String name;
        int age;
        String address;


        public Man(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public String toString() {
            return (name + " " + age + " " + address );
        }
    }

    public static class Woman {
        String name;
        int age;
        String address;


        public Woman(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public String toString() {
            return (name + " " + age + " " + address );
        }
    }
}
