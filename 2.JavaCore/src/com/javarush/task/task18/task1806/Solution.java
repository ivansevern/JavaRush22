package com.javarush.task.task18.task1806;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
Исправить ошибки
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream("c:/Razrabotka/data.txt");
        //создаем поток-записи-байт-в-файл
        FileOutputStream outputStream = new FileOutputStream("c:/Razrabotka/result.txt");

//        if (inputStream.read() >= 0) {
        if (inputStream.available() > 0) {
            //читаем весь файл одним куском
            byte[] buffer = new byte[inputStream.available()];
            int count = inputStream.read(buffer);
            outputStream.write(buffer, 0, count);
        }

        inputStream.close();  //reset -> close
        outputStream.close(); //flush -> close
    }
}