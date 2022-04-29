package com.javarush.task.task16.task1618;

/*
Снова interrupt
 */

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        //add your code here
        TestThread t = new TestThread();
        t.start();
        t.interrupt();
    }

    //add your code below
    public static class TestThread extends Thread {
        public void run() {
        }
    }
}