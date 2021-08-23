package ru.freeIt.homework.studyBookChapter3Hw;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

//Вывести список файлов и каталогов выбранного каталога на диске. Файлы и каталоги
//        должны быть распечатаны отдельно
public class Query36 {
    public static void main(String[] args) {
        String path = "src/ru/freeIt/homework/studyBookChapter3Hw";
        File file = new File(path);
        List<String> listInnerCatalog = new ArrayList<>();
        listInnerCatalog.add(path);
        getStructure(file);
    }

    public static File getFile(String path) {
        File file = new File(path);
        return file;
    }

    public static void getStructure(File file) {
        for (int i = 0; i < file.list().length; i++) {
            if (!file.listFiles()[i].isDirectory()) {
                System.out.println("File name: " + file.listFiles()[i].getName());
            } else {
                System.out.println("Catalog name: " + file.listFiles()[i].getName());
                getStructure(getFile(file.getPath()+"/" + file.listFiles()[i].getName()));
            }
        }
    }
}
