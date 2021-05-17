package ru.freeIt.homework.lesson5;
//Заменить все вхождения символа стоящего в позиции (3) на сивол стоящий в
//        позиции 0
public class Query2 {
    public static void main(String[] args) {
        String str = "sorem ipsum dolor sit Amet, consectetur B adipiscing elit.";
        str = str.replaceAll(Character.toString(str.charAt(0)), Character.toString(str.charAt(3)));
        System.out.println(str);
    }
}
