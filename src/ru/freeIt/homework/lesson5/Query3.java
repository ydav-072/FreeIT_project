package ru.freeIt.homework.lesson5;

import java.io.*;

//В исходном файле находятся слова, каждое слово на новой стороке. После
//        запуска программы должен создать файл, который будет содержать в себе
//        только полиндромы
//pool
//try
//cool
//mam
//non
//kill
//oko
public class Query3 {
    public static void main(String[] args) {

        try{
            BufferedReader bufferedReader = new BufferedReader(new FileReader("src/ru/freeIt/homework/lesson5/resource/text.txt"));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/ru/freeIt/homework/lesson5/resource/polindrom.txt"));

            while (bufferedReader.ready()){
                String str = bufferedReader.readLine();
                if (str.equals(new StringBuilder(str).reverse().toString())){
                    bufferedWriter.write(str);
                    bufferedWriter.newLine();
                }
            }
            bufferedReader.close();
            bufferedWriter.close();
        }
        catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
