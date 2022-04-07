package com.javarush.task.task04.task0421;
//TODO: ввод строк и сравнивание длин

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Настя или Настя?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write this code
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name1 = reader.readLine();
        String name2 = reader.readLine();

       if (name1.equals(name2)) {       //сравниваем имена, если правда вывод сообщения
           System.out.println("Имена идентичны");}


       else if (name1.length() == name2.length()) {  //сравниваем длины имен
           System.out.println("Длины имен равны");
       }
    }
}
