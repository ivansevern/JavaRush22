package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/*
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat();
        Map<String, Date> map = new HashMap<>();
        map.put("Смирнов", dateFormat.parse("May 1 2012"));

        //напишите тут ваш код
        map.put("Иванов", dateFormat.parse("JUNE 1 2012"));
        map.put("Кузнецов", dateFormat.parse("JULY 1 2012"));
        map.put("Соколов", dateFormat.parse("AUGUST 1 2012"));
        map.put("Попов", dateFormat.parse("SEPTEMBER 1 2012"));
        map.put("Лебедев", dateFormat.parse("MAY 1 2012"));
        map.put("Новиков", dateFormat.parse("JUNE 1 2012"));
        map.put("Козлов", dateFormat.parse("JUNE 1 2012"));
        map.put("Морозов", dateFormat.parse("JUNE 1 2012"));
        map.put("Петров", dateFormat.parse("JUNE 1 2012"));
        return map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        //напишите тут ваш код
        Map<String, Date> copy = new HashMap<>();
        for (String key : copy.keySet()) {
            Date date = copy.get(key);
            int month = date.getMonth() + 1;
            if (month == 6 || month == 7 || month == 8) {
                map.remove(key);
            }
        }
    }

    public static void main(String[] args) {

    }
}
