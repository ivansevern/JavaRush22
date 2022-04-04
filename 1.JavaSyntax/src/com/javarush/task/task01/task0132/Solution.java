package com.javarush.task.task01.task0132;

/*
Сумма цифр трехзначного числа
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        //напишите тут ваш код
        int sum = 0;             //создаем переменную со значением 0
        sum = sum + number % 10; //number % 10 остаток от деления на 10, последняя (третья) цифра числа number, прибавляем ее к сумме
        number = number / 10;    //целочисленное деление (дробная часть отбрасывается)
        sum = sum + number % 10;
        number = number / 10;
        sum = sum + number % 10;
        return sum;
    }
}
