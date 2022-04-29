package com.javarush.task.task16.task1617;

/*
Отсчет на гонках
*/

public class Solution {
    public static volatile int numSeconds = 3;

    public static void main(String[] args) throws InterruptedException{
        RacingClock clock = new RacingClock();
        //add your code here
        Thread.sleep(3500);
        clock.interrupt();
    }

    public static class RacingClock extends Thread {
    public RacingClock() {
        start();
    }

        public void run() {
        //add your code here
            try {
                while (!isInterrupted() && numSeconds >= 0) {
                    if (numSeconds == 0) {
                        System.out.println("Марш");
                    } else {
                        System.out.println(numSeconds + " ");
                        Thread.sleep(1000);
                    }
                    numSeconds--;
                }
            } catch (InterruptedException e) {
                if (numSeconds != -1) {
                    System.out.println("Прервано");
                }
            }
        }
    }
}