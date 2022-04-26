package com.javarush.task.task15.task1511;

import java.io.Serializable;

/*
Максимально простой код
*/

public class Solution {
    public static void main(String[] args) {
        JuniorJavaDev me = new JuniorJavaDev();
        System.out.println(me.askHubert("What do you think about this task?"));
        System.out.println(me.askZapp("When will the next update happen?"));
    }

    public interface SpecificSerializable extends Serializable {
    }

    public static class JavaDev extends Object implements SpecificSerializable {
        String answerQuestion(String question) {
            return String.format("this is the answer for [%s]", question);
        }
    }

    public static class JuniorJavaDev extends  JavaDev {
//        public static class JuniorJavaDev extends Object, JavaDev implements SpecificSerializable {
        JavaDev zap = new JavaDev();
        JavaDev hubert = new JavaDev();

        String askZapp(String question) {
            return zap.answerQuestion((question));
        }

        String askHubert(String question) {
            return hubert.answerQuestion(question);
        }
    }
}