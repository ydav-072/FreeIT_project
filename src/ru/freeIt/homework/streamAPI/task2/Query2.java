package ru.freeIt.homework.streamAPI.task2;

import java.io.*;
import java.util.Arrays;

//Задать массив строк. Используя средства Stream API отсортировать строки в
//        лексикографическом порядке по возрастанию и убыванию
public class Query2 {
    public static void main(String[] args) {
        File file = new File("src/ru/freeIt/homework/streamAPI/task2/resource/string.txt");
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            StringBuilder stringBuilder = new StringBuilder();
            while (bufferedReader.ready()) {
                stringBuilder.append(bufferedReader.readLine());
            }
            bufferedReader.close();
            String[] stringList = stringBuilder.toString().replaceAll("\\p{P}", "").split(" ");
            Arrays.stream(stringList).sorted(String::compareToIgnoreCase).forEach(System.out::println);
            System.out.println();
            Arrays.stream(stringList).sorted((el1, el2) -> el2.compareToIgnoreCase(el1)).forEach(System.out::println);
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }
}
