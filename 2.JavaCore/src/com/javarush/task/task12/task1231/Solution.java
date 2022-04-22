package com.javarush.task.task12.task1231;

/*
Ненужные абстракции
*/

public class Solution {
    public static void main(String[] args) {
        Horse horse = new Pegasus();
        horse.run();
    }

    public interface CanFly {  //public static interface -> public interface
        void fly();
    }

    public static class Horse { //public static abstract class -> public static class
        public void run() {
        }
    }

    public static class Pegasus extends Horse {
        public void fly() {
        }
    }

    public static abstract class SwimmingPegasus extends Pegasus {
        public abstract void swim();
    }
}