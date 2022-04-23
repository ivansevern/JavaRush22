package com.javarush.task.task13.task1321;

/*
Исправление ошибок
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(Dream.HOBBY.toString());
        System.out.println(new Hobby().INDEX);
    }

    interface Desire {
    }

    interface Dream {  // interface Dream implements Hobby -> interface Dream
//        public static Hobby HOBBY = new Hobby();
        Hobby HOBBY = new Hobby();
    }

    static class Hobby implements Desire, Dream {  //extends -> implements
        static int INDEX = 1;

        @Override
        public String toString() {
            INDEX++;
            return  "" + INDEX;
        }
    }
}