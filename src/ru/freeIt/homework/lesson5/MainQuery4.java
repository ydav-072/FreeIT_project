package ru.freeIt.homework.lesson5;

import java.io.*;

//Текстовый файл содержит текст. После запуска программы в другой файл
//        должны записаться только те предложения в которых от 3-х до 5-ти слов. Если в
//        предложении присутствует слово-палиндром, то не имеет значения какое кол-во
//        слов в предложении, оно попадает в новый файл.
//        Пишем все в ООП стиле. Создаём класс TextFormater
//        в котором два статических метода:
//        1. Метод принимает строку и возвращает кол-во слов в строке.
//        2. Метод принимает строку и проверяет есть ли в строке слово-палиндром. Если
//        есть возвращает true, если нет false
//В main считываем файл.
//        Разбиваем текст на предложения. Используя методы класса TextFormater
//        определяем подходит ли нам предложение. Если подходит добавляем его в
//        новый файл
public class MainQuery4 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("src/ru/freeIt/homework/lesson5/resource/textForQuery4.txt"));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/ru/freeIt/homework/lesson5/resource/resultTextQuery4.txt"));
        String str = null;
        while (bufferedReader.ready()) {
            str = bufferedReader.readLine();
            if (TextFormater.findPolindrom(str) | TextFormater.countValueWords(str) >= 3 & TextFormater.countValueWords(str) <= 5) {
                bufferedWriter.write(str);
                bufferedWriter.newLine();
            }
        }
        bufferedReader.close();
        bufferedWriter.close();
    }
}
