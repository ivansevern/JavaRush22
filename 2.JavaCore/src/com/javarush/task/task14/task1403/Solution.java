package task14.task1403;

/*
 * 1. Правильно расставить наследования между Building и School
 * 2. Подумать, объект какого класса должны возвращать методы getSchool и getBuilding
 * 3. Изменить null на объект класса  Building или School
 */

public class Solution {
    public static void main(String[] args) {
        Building school = getSchool();
        Building shop = getBuilding();

        System.out.println(school);
        System.out.println(shop);
    }

    public static Building getSchool() {
        //Изменить null на объект класса  Building или School
        return new School();
    }

    public static Building getBuilding() {
        //Изменить null на объект класса  Building или School
        return new Building();
    }



    static class School extends Building {
        @Override
        public String toString() {
            return "School";
        }
    }


    static class Building {
        @Override
        public String toString() {
            return "Building";
        }
    }
}
