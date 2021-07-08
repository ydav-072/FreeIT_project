package ru.freeIt.homework.streamAPI.task5;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Задать список учеников с принадлежностью к классу (создать класс Student).
//        Используя средства Stream API 1) вывести список фамилий 2) создать Map со
//        списком учеников для каждого класса
public class Query5 {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        Student student1 = new Student("Matvei", "Loban", 12);
        Student student2 = new Student("Matvei2", "Loban2", 11);
        Student student3 = new Student("Matvei3", "Loban3", 12);
        Student student4 = new Student("Matvei4", "Loban4", 10);
        Student student5 = new Student("Matvei5", "Loban5", 12);
        Student student6 = new Student("Matvei6", "Loban6", 11);
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);
        studentList.add(student6);

        Map<Integer, List<Student>> mapOfStudent = studentList.stream().collect(Collectors.groupingBy(a -> a.getNumberClass()));

        studentList.forEach(el -> System.out.println(el.getName()));
    }
}
