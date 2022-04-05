package com.javarush.task.task04.task0413;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
День недели
 */
public class Solution {
    public static void main(String[] args) throws IOException {
        //write this code
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int day = Integer.parseInt(reader.readLine());
        switch (day) {
            case 1:
                System.out.println("понедельник");
                break;
            case 2:
                System.out.println("вторник");
                break;
            case 3:
                System.out.println("среда");
                break;
            case 4:
                System.out.println("четверг");
                break;
            case 5:
                System.out.println("пятница");
                break;
            case 6:
                System.out.println("суббота");
                break;
            case 7:
                System.out.println("воскресенье");
                break;
            default:
                System.out.println("такого дня не существует");
                break;
        }

        /*if (day == 1) System.out.println("понедельник");
        else if (day == 2) System.out.println("вторник");
        else if (day == 3) System.out.println("среда");
        else if (day == 4) System.out.println("четверг");
        else if (day == 5) System.out.println("пятница");
        else if (day == 6) System.out.println("суббота");
        else if (day == 7) System.out.println("воскресенье");
        else System.out.println("такого дня не существует");*/
    }
}
