package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.Map;

/*
Перепись населения
*/

public class Solution {
    public static Map<String, String> createMAp() {
        //напишите тут ваш код
        Map<String, String> map = new HashMap<>();
        map.put("Смирнов", "Сильвестр");
        map.put("Иванов", "Дмитрий");
        map.put("Кузнецов", "Арнольд");
        map.put("Соколов", "Роман");
        map.put("Попов", "Максим");
        map.put("Лебедев", "Ярослав");
        map.put("Новиков", "Александр");
        map.put("Козлов", "Михаил");
        map.put("Морозов", "Илья");
        map.put("Петров", "Алексей");
        return map;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        //напишите тут ваш код
        int count = 0;
        for (String nameTmp : map.values()) {
            if (nameTmp.equals(name)) {
                count++;
            }
        }
        return count;
    }

    public static int getCountTheSameLastName(Map<String, String> map, String name) {
        //напишите тут ваш код
        int count = 0;
        for (String lastnameTmp : map.values()) {
            if (lastnameTmp.equals(name)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

    }
}
