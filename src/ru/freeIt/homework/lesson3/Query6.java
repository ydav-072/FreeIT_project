package ru.freeIt.homework.lesson3;
//Напишите программу вывода всех четных чисел от 2 до 100 включительно

public class Query6 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 2; i <= 100; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("Сумма четных чисел в диапазоне от 2 до 100 = " + sum);
    }
}
