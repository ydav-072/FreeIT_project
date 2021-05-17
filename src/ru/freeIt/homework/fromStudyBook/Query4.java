package ru.freeIt.homework.fromStudyBook;
//Определить число, полученное выписыванием в обратном порядке цифр
//        любого 4-х значного натурального числа n
public class Query4 {
    public static void main(String[] args) {
        int value = 2356;
        int result = 0;
        int tmp = 0;

        tmp = value % 10;
        value = (value - tmp) / 10;
        result = tmp;

        tmp = value % 10;
        value = (value - tmp) / 10;
        result = result * 10 + tmp;

        tmp = value % 10;
        value = (value - tmp) / 10;
        result = result * 10 + tmp;

        tmp = value % 10;
        result = result * 10 + tmp;

        System.out.println(result);
    }
}
