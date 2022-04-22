package com.javarush.task.task13.task1305;

/*
Четыре ошибки
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(Dream.HOBBY.toString()); //1 new Dream.HOBBY.toString() -> Dream.HOBBY.toString()
        System.out.println(new Hobby().toString());
    }

    interface Desire {
    }

    interface Dream {
//        private static hobby HOBBY = new Hobby();  //2
        Hobby HOBBY = new Hobby();
    }

    static class Hobby implements Desire, Dream {  //3,4 class Hobby implements Dream -> static class Hobby implements Desire, Dream
        static int INDEX = 1;

        @Override
        public String toString() {
            INDEX++;
            return "" + INDEX;
        }
    }
}