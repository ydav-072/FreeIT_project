package ru.freeIt.homework.lesson12;
//Проверка на цензуру:
//        Создаете 2 файла.
//        1 - й. Содержит исходный текст.
//        2 - й. Содержит слова недопустимые в тексте(black list). Структура файла
//        определите сами, хотите каждое слово на новой строке, хотите через запятую
//        разделяйте, ваша программа делайте как считаете нужным.
//        Задача: необходимо проверить проходит ли текст цензуру. Если в тексте не
//        встретилось ни одного недопустимого слова, то выводите сообщение о том что
//        текст прошёл проверку на цензуру. Если нет, то выводите соответствуюущее
//        сообщение, кол-во предложений не прошедших проверку и сами предложения
//        подлежащие исправлению.

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Query3 {
    public static void main(String[] args) {
        String path = "src/ru/freeIt/homework/lesson12/resource";
        String fileSource = "sourceText.txt";
        String fileBlackList = "blackList.txt";
        List<String> listSource = readFile(getFile(path, fileSource));
        for (String str : listSource) {
            System.out.println(str);
        }
        List<String> listBlack = readFile(getFile(path, fileBlackList));
        for (String str : listBlack) {
            System.out.println(str);
        }

        cenzText(listSource, listBlack);
    }

    public static File getFile(String path, String nameFile) {
        return new File(path, nameFile);
    }

    public static List<String> readFile(File file) {
        List<String> listOfLine = new ArrayList<>();
        StringBuilder line = new StringBuilder();
        String[] strArr;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            while (bufferedReader.ready()) {
                line.append(bufferedReader.readLine());
            }
        } catch (FileNotFoundException exception) {
            System.out.println("Can't find file");
            exception.printStackTrace();
        } catch (IOException exception) {
            System.out.println("Can't close file");
            exception.printStackTrace();
        }
        strArr = line.toString().toLowerCase(Locale.ROOT).split("[.!?]");
        for (int i = 0; i < strArr.length; i++) {
            listOfLine.add(strArr[i]);
        }
        return listOfLine;
    }

    public static void cenzText(List<String> listOfText, List<String> listOfBlack) {
        int valueOfSentence = 0;
        StringBuilder allSentenceBlack = new StringBuilder();
        for (String find : listOfBlack) {
            for (String str : listOfText) {
                if (str.contains(find)) {
                    valueOfSentence++;
                    System.out.println("Wrong sentence is: " + str);
                }
            }
        }
        if (valueOfSentence <= 0) {
            System.out.println("текст прошёл проверку на цензуру");
        } else {
            System.out.println("Value of wrong sentence is: " + valueOfSentence);
        }
    }
}
