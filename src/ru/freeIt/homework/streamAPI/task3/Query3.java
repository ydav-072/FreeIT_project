package ru.freeIt.homework.streamAPI.task3;

import java.io.*;
import java.util.Arrays;

//Задать массив строк. Используя средства Stream API определить количество
//        уникальных значений.
public class Query3 {
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
            long valueOfUniqElem = Arrays.stream(stringList).distinct().count();
            System.out.println(valueOfUniqElem);
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }
}
