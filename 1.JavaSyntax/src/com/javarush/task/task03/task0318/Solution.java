package com.javarush.task.task03.task0318;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
План по захвату мира
*/

public class Solution {
    public static void main(String[] args) throws Exception{
        //write this code
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        int years = Integer.parseInt(reader.readLine());  //парсинг числа в текст
        String years = reader.readLine();
        String name = reader.readLine();

System.out.println(name + " захватит мир через " + years + " лет. Му-ха-ха!");



    }
}
