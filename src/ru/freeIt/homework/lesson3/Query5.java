package ru.freeIt.homework.lesson3;
//Напишите программу печати таблицы перевода расстояний из дюймов в сантиметры для значений длин от 1 до 20 дюймов. 1 дюйм = 2,54 см

public class Query5 {
    public static void main(String[] args) {
        double inch = 2.54;
        double sm = 0;
        double result = 0;
        for (int i = 0; i <= 20; i++){
            result = (++sm) * inch;
            System.out.println(sm + " см = " + result + " дюйм");
        }
    }
}
