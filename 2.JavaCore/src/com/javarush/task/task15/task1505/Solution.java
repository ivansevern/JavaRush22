package com.javarush.task.task15.task1505;

/*
ООП - исправь ошибки в наследовании
*/

public class Solution {
    public interface HasWeight {
        int getWeight(); //int getValue() -> int getWeight()
    }

    public interface HasHeight {
        int getHeight(); //int getValue() -> int getWeight()
    }

    public static class Human implements HasHeight, HasWeight { //extends -> implements
        @Override
        public int getWeight() { //public int getValue() -> public int getWeight()
            return 75;
        }

        @Override
        public int getHeight() { //public int getValue() -> public int getHeight()
            return 180;
        }
    }

    public static void main(String[] args) {
        Human human = new Human();
        System.out.println(human.getWeight()); //human.getValue() -> human.getWeight()
        System.out.println(human.getHeight()); //human.getValue() -> human.getHeight()
    }
}