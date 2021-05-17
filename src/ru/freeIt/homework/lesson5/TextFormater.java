package ru.freeIt.homework.lesson5;

import java.util.ArrayList;
import java.util.List;

public class TextFormater {

    public static int countValueWords(String str) {
        String[] arrayStr = str.split(" ");
        return arrayStr.length;
    }

    public static boolean findPolindrom(String str) {
        boolean flag = false;
        String localStr = str.replaceAll("\\p{P}", " ");
        String[] arrayStr = localStr.split(" ");
        for (int i = 0; i < arrayStr.length; i++) {
            if (arrayStr[i].equals(new StringBuilder(arrayStr[i]).reverse().toString())) {
                flag = true;
            }
        }
        return flag;
    }
}
