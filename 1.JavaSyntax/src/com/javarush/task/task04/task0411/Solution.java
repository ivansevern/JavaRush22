package com.javarush.task.task04.task0411;

/*
Время года
*/

public class Solution {
    public static void main(String[] args) {
        checkSeason(12);
        checkSeason(4);
        checkSeason(7);
        checkSeason(10);
    }

    public static void checkSeason(int month) {
        //write this code
        switch (month) {
            case 1:
            case 2:
            case 12:
                System.out.println("зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("осень");
                break;
            default:
                System.out.println("неверный номер месяца");
                break;
        }

   /*     if (month >= 3 && month <= 5)    // если номер месяца >= 3 или <= 5 то выводим сообщение
            System.out.println("весна");
        else if (month >= 6 && month <= 8) //иначе если
            System.out.println("лето");
        else if (month >= 9 && month <= 11)
            System.out.println("осень");
        else System.out.println("зима"); //иначе остальные варианты*/
    }
}
