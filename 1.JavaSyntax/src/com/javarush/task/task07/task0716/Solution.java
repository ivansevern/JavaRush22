package com.javarush.task.task07.task0716;

import java.util.ArrayList;

/*
Р или Л
 */

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("Роза");
        strings.add("лоза");
        strings.add("лира");
        strings = fix(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> strings) {
        //write this code
        String r = "р";
        String l = "л";

        ArrayList<String> result = new ArrayList<>();
        for (String string : strings) {
            boolean isR = string.contains(r);
            boolean isL = string.contains(l);
            if (isR && !isL) {
                continue;
            }
            if (!isR && isL) {
                result.add(string);
            }
            result.add(string);
        }
        return result;
    }

        /*for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).contains("р") && !strings.get(i).contains("л")) {        // проверяем слова на буквы
                strings.remove(strings.get(i));                                          // л и р если нет
                i--;                                                                     // удаляем слово из списка
            }
            else if (strings.get(i).contains("л") && !strings.get(i).contains("р")) {    //удваиваем слово если
                strings.add(i+1, strings.get(i));                                  //буква л есть
                i++;
            }
        }
        return strings;
    }*/
}
