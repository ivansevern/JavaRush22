package com.javarush.task.task13.task1313;

/*
Лисица - это такое животное
*/

import java.awt.*;

public class Solution {
    public static void main(String[] args) throws Exception {
    }

    public interface Animal {
        Color getColor();
    }

    public static abstract class Fox implements Animal { //public static class -> public static abstract class
        public String getName() {
            return "Fox";
        }
    }
}