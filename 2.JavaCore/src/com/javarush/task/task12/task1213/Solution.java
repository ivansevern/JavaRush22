package com.javarush.task.task12.task1213;

/*
"Исправить код" часть 2
 */

public class Solution {
    public static void main(String[] args) {
    }

    public static abstract class Pet { //public static class -> public static abstract class
        public String getName() {
            return "Я - котенок";
        }

        public abstract Pet getChild(); //public Pet -> public abstract Pet
    }
}