package ru.freeIt.homework.studyBookChapter3Hw;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

//Имеется файл с текстом, в котором присутствуют числа. Найти все числа,
//        распечатать, посчитать сумму, убрать все повторяющиеся числа и снова
//        распечатать.
public class Query34 {
    public static void main(String[] args) {
        File file = new File("src/ru/freeIt/homework/studyBookChapter3Hw/resource", "text34.txt");
        getNumber(readFile(file));

    }

    public static StringBuilder readFile(File file) {
        List<String> listWords = new LinkedList<String>();
        StringBuilder str = new StringBuilder();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            while (bufferedReader.ready()) {
                str.append(bufferedReader.readLine());
            }
        } catch (IOException exception) {
            System.out.println("what's happened wrong in readFile :(");
            exception.printStackTrace();
        }
        return str;
    }

    public static void getNumber(StringBuilder stringBuilder) {
        String[] number = stringBuilder.toString().replaceAll("\\D+", " ").trim().split(" ");
        int sum = 0;
        Set<String> setOfNumber = new LinkedHashSet<>();
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + " ");
            sum += Integer.parseInt(number[i]);
            setOfNumber.add(number[i]);
        }
        System.out.println();
        System.out.println(sum);
        System.out.println(setOfNumber);
    }
}
