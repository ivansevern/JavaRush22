package com.javarush.task.task05.task0502;

/*
Реализовать метод fight
*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        //write this code
      int ageScore = Integer.compare(this.age, anotherCat.age);
      int weightScore = Integer.compare(this.weight, anotherCat.weight);
      int strengthScore = Integer.compare(this.strength, anotherCat.strength);

      int count = ageScore + weightScore + strengthScore;
      return  count >0;
    }

    public static void main(String[] args) {
    }
}
/*compare - сравнивает(x, y)
если (x==y) - возвращает 0
     (x<y) - возвращает -1
     (x>y) - возвращает 1
 */


