package ru.freeIt.homework.studyBookChapter3Hw;

import java.io.*;

//Создать файл с текстом, прочитать, подсчитать в тексте количество знаков
//        препинания и слов.
public class Query33 {
    public static void main(String[] args) {
        File file = createFile("src/ru/freeIt/homework/studyBookChapter3Hw/resource", "text33.txt");
        writeInFile("it is cool story, I can write in file text and other data!\n Test new line text, it is amazing.", file);
        System.out.println(readFile(file));
        calculationSymbolsAndWords(readFile(file));
    }

    public static File createFile(String path, String fileName) {
        File dirPath = new File(path);
        if (!dirPath.exists()) {
            System.out.println("Creating dir:" + dirPath.getName());
            dirPath.mkdirs();
        } else {
            System.out.println("Dir " + dirPath.getName() + " is exist");
        }
        File file = new File(dirPath + "/" + fileName);
        try {
            if (file.createNewFile()) {
                file.createNewFile();
                System.out.println("File " + fileName + " was created");
            } else {
                System.out.println("File is already exist");
            }
        } catch (IOException exception) {
            System.out.println("what's happened wrong in createdFile :(");
            exception.printStackTrace();
        }
        return file;
    }

    public static void writeInFile(String str, File file) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))) {
            bufferedWriter.write(str);
            bufferedWriter.flush();
        } catch (IOException exception) {
            System.out.println("what's happened wrong in writeFile :(");
            exception.printStackTrace();
        }
    }

    public static StringBuilder readFile(File file) {
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

    public static void calculationSymbolsAndWords(StringBuilder str) {
        String text = str.toString();
        int valueOfPunctuation = str.length() - text.replaceAll("\\p{P}", "").length();
        System.out.println("Value punctuation marks: " + valueOfPunctuation);
        int valueOfWords = text.replaceAll("\\p{P}", "").split(" ").length;
        System.out.println("Value words in text: " + valueOfWords);
    }
}
