package ru.freeIt.homework.lesson3;
//Напишите программу печати таблицы перевода расстояний из дюймов в сантиметры для значений длин от 1 до 20 дюймов. 1 дюйм = 2,54 см

public class Query5 {
    public static void main(String[] args) {
        double inch = 2.54;
        double result = 0;
        for (int i = 1; i <= 20; i++){
            result = i * inch;
            System.out.println(i + " см = " + result + " дюйм");
        }
    }
}
