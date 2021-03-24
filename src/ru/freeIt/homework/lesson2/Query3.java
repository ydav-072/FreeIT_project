package ru.freeIt.homework.lesson2;
//Дано целое число. Если оно является положительным, то прибавить к нему 1.Если отрицательным, то вычесть из него 2.
//        Если нулевым, то заменить его на 10. Вывести полученное число

public class Query3 {
    public static void main(String[] args) {
        int value = -2;

        if (value > 0){
            value++;
        }
        if (value < 0){
            value = value -2;
        }
        if (value == 0 ){
            value = 10;
        }
        System.out.println(value);
    }
}
