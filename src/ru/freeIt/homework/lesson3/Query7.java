package ru.freeIt.homework.lesson3;
//Напишите программу, определяющую сумму всех нечетных чисел от 1 до 99
public class Query7 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 99; i++){
            if (i % 2 != 0){
                sum+= i;
            }
        }
        System.out.println("Сумма нечетных чисел в диапазоне от 1 до 99 = " + sum);
    }
}
