package com.javarush.task.task02.task0204;
/*
О семейных отношениях
 */

public class Solution {
    public static void main(String[] args) {
        //write this code

//создаю переменную woman типа Woman (Woman woman) и объект Woman
//(new Woman()) и присваиваем переменной ссылку на объект
Woman woman = new Woman();
//создаю переменную man типа Man (Man man) и объект Man
//(new Man()) и присваиваем переменной ссылку на объект
Man man = new Man();
//в woman.husband сохраняем ссылку на ранее созданный объект Man
woman.husband = man;
//в man.wife сохраняем ссылку на ранее созданный объект Woman
man.wife=woman;
    }
    public static class Man{
        public int age; //объявляю переменные
        public int height;
        public Woman wife; //объявляю переменную wife типа Woman
    }
    public static class Woman{
        public int age; //объявляю переменные
        public int height;
        public Man husband; //объявляю переменную husband типа Man
    }
}
