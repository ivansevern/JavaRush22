package com.javarush.task.task06.task0621;

/*
Родственные связи кошек
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String dadName = reader.readLine();
        Cat catDad = new Cat(dadName);

        String baName = reader.readLine();
        Cat catBa = new Cat(baName);

        String fatherName = reader.readLine();
        Cat catFather = new Cat(fatherName, null, catDad);

        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName, catBa, null);

        String sonName = reader.readLine();
        Cat catSon = new Cat(sonName, catMother, catFather);

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, catMother);

        System.out.println(catDad);
        System.out.println(catBa);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catSon);
        System.out.println(catDaughter);

    }

    public static class Cat {
        private String name;
        private Cat mother;
        private Cat father;

        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat mother) {
            this.name = name;
            this.mother = mother;
        }

        Cat(String name, Cat mother, Cat father) {
            this.name = name;
            this.mother = mother;
            this.father = father;
        }

        @Override
        public String toString() {
            if (father == null) {
                if (mother == null) {
                    return "The cat's name is " + name + ", no mother, no father";
                } else {
                    return "The cat's name is " + name + ", mother is " + mother.name + ", no father";
                }
            } else {
                if (mother == null) {
                    return "The cat's name is " + name + ", no mother" + " father is  " + father.name;
                } else {
                    return "The cat's name is " + name + ", mother is " + mother.name + ", father is " + father.name;
                }
            }
        }

        /* @Override
        public String toString() {
            if (mother == null && father == null)
                return "The cat's name is " + name + ", no mother, no father ";
            if (mother != null && father == null)
                return "The cat's name is " + name + ", mother is " + mother.name + ", no father";
            if (mother == null)
                return "The cat's name is " + name + ", no mother" + " father is  " + father.name;
            else
                return "The cat's name is " + name + ", mother is " + mother.name + ", father is " + father.name;
        }*/
    }
}
