package ru.freeIt.homework.studyBookChapter3Hw;

import java.io.*;
import java.util.Random;

//Записать в двоичный файл 20 случайных чисел. Прочитать записанный файл,
//        распечатать числа и их среднее арифметическое.
public class Query35 {

    public static void main(String[] args) {
        File file = new File("src/ru/freeIt/homework/studyBookChapter3Hw/resource", "text35.dat");
        writeBinaryFile(file);
        readBinaryFile(file);
    }

    public static void writeBinaryFile(File file) {
        Random random = new Random(0);
        DataOutputStream dataOutputStream;
        try {
            dataOutputStream = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
        } catch (FileNotFoundException exception) {
            System.out.println("File not found");
            exception.printStackTrace();
            return;
        }
        try {
            for (int i = 0; i <= 20; i++) {
                dataOutputStream.writeInt(random.nextInt());
            }
            dataOutputStream.close();
        } catch (IOException exception) {
            System.out.println("input exception");
            exception.printStackTrace();
            return;
        }
    }

    public static void readBinaryFile(File file) {
        DataInputStream dataInputStream = null;
        try {
            dataInputStream = new DataInputStream(new BufferedInputStream(new FileInputStream(file)));
        } catch (FileNotFoundException exception) {
            System.out.println("File not find");
            exception.printStackTrace();
        }
        try {
            int res = dataInputStream.readInt();
            int avrSum = res;
            int count = 1;
            while (true) {
                System.out.println(res);
                try {
                    res = dataInputStream.readInt();
                    avrSum += res;
                    count++;
                } catch (EOFException exception) {
                    System.out.println("EOFException");
                    break;
                }
            }
            System.out.println("avr = " + avrSum / count);
            if (dataInputStream != null) {
                dataInputStream.close();
            }
        } catch (IOException exception) {
            System.out.println("IOException");
            exception.printStackTrace();
        }
    }
}
