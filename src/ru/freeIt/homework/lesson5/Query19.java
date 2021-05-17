package ru.freeIt.homework.lesson5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Имеется строка с текстом. Вывести текст, составленный из последних букв
//        всех слов.
public class Query19 {
    public static void main(String[] args) {
        String str = "Строковый литерал — это последовательность символов,\n" +
                "заключенных в двойные кавычки.";
        String resultStr = new String();
        Pattern pattern = Pattern.compile("([a-zа-я])\\b");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()){
            resultStr += matcher.group(1);
        }
        System.out.println(resultStr);
    }
}
