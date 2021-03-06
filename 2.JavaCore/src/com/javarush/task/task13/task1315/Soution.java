package com.javarush.task.task13.task1315;

/*
Том, Джерри и Спайк
*/

public class Soution {
    public static void main(String[] args) {
    }

    //может двигаться
    public interface Movable {
        void move();
    }

    //может быть съеден
    public interface Edible {
        void beEaten();
    }

    //может кого-то съесть
    public interface Eat {
        void eat();
    }

    class Cat implements Movable, Edible, Eat {

        public void eat() {
        }

        public void beEaten() {
        }

        public void move() {
        }
    }

    class Mouse implements Movable, Edible {
        public void beEaten() {
        }

        public void move() {
        }
    }

    class Dog implements Movable, Eat {
        public void eat() {
        }

        public void move() {
        }
    }
}