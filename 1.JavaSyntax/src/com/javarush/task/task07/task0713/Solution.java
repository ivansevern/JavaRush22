package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Играем в Jолушку
 */

public class Solution {
    public static void main(String[] args) throws Exception {
        //write this code
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            int number = Integer.parseInt(reader.readLine());
            numbers.add(number);
        }

        ArrayList<Integer> divBy3 = new ArrayList<>();
        ArrayList<Integer> divBy2 = new ArrayList<>();
        ArrayList<Integer> others = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            int number = numbers.get(i);
            if ((number % 3 == 0) || (number % 2 == 0)) {
                if (number % 3 == 0) {
                    divBy3.add(number);
                }
                if (number % 2 == 0) {
                    divBy2.add(number);
                }
            } else {
                others.add(number);
            }
        }

        printList(divBy3);
        printList(divBy2);
        printList(others);
    }

    public static void printList(ArrayList<Integer> list) {
        for (Integer number : list) {
            System.out.println(number);
        }
    }

       /* ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            list.add(Integer.parseInt(reader.readLine()));
            int a = list.get(i);
            if (a % 3 == 0 && a % 2 == 0) {
                list3.add(a);
                list2.add(a);
            } else if (a % 3 == 0)
                list3.add(a);
            else if (a % 2 == 0)
                list2.add(a);
            else list1.add(a);
        }
        printList(list3);
        printList(list1);
    }


    public static void printList(ArrayList<Integer> list) {
        //write this code
        for (int i : list) {
            System.out.println(i);
        }
    }*/
}

