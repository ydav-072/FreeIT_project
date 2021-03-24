package ru.freeIt.homework.lesson3;
//Начав тренировки, спортсмен в первый день пробежал 10 км.
//        Каждый день он увеличивал дневную норму на 10% нормы предыдущего дня.
//        Какой суммарный путь пробежит спортсмен за 7 дней?

public class Query1 {
    public static void main(String[] args) {
        double distance = 10;
        double resultDistance = 0;
        for (int i = 0; i < 7; i++){
            distance = distance + (distance * 0.1);
            resultDistance = distance + resultDistance;
        }
        System.out.println(resultDistance);
    }
}
