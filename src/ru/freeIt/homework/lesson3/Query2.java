package ru.freeIt.homework.lesson3;
//Одноклеточная амеба каждые 3 часа делится на 2 клетки.
//        Определить,сколько амеб будет через 3, 6, 9, 12,..., 24 часа.

public class Query2 {
    public static void main(String[] args) {
        int valueOfAmeba = 1;
        for (int i = 0; i < 8; i++){
            valueOfAmeba = valueOfAmeba * 2;
        }
        System.out.println(valueOfAmeba);
    }
}
