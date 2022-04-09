package com.javarush.task.task06.task0604;

/*
Ставим котов на счетчик
*/

public class Cat {
    public static int catCount = 0;

    public String name;
    public int age;

    public Cat() {
        catCount++;
    }
    //write this code

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    protected void finalize() throws Throwable {
        catCount--;
        super.finalize();
    }

    public static void main(String[] args) {

    }
}
