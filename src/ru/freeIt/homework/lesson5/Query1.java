package ru.freeIt.homework.lesson5;
//Вырезать подстроку из строки начиная с первого вхождения символа(А) до,
//        последнего вхождения сивола(B)
public class Query1 {
    public static void main(String[] args) {
        String str = "Lorem ipsum dolor sit Amet, consectetur B adipiscing elit.";
        str = str.substring(str.indexOf('A'), str.lastIndexOf('B'));
        System.out.println(str);
    }
}
