package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[] {'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();

        StringBuffer buffer1 = new StringBuffer();
        StringBuffer buffer2 = new StringBuffer();
        for (char character : string.toCharArray()) {
            if (isVowel(character)) {
                buffer1.append(character).append(" ");
            } else if (character != ' ') {
                buffer2.append(character).append(" ");
            }
        }
        System.out.println(buffer1);
        System.out.println(buffer2);
    }

    //метод проверяет, гласная ли буква
    public static boolean isVowel(char character) {     //приводим символ в нижний регистр - от заглавных к строчным буквам
        character = Character.toLowerCase(character); //ищем среди массива гласных
        for (char vowel : vowels) {
            if (character == vowel) {
                return true;
            }
        }
        return false;
    }
}
