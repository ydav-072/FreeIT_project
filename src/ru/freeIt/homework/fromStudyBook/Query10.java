package ru.freeIt.homework.fromStudyBook;

import java.util.Random;

//Посчитать факториал числа в границах от 10 до 15 (не используя рекурсию)
public class Query10 {
    public static void main(String[] args) {
        long result = 1l;
        Random random = new Random();
        int value = random.nextInt(6) +10;
        System.out.println(value);
        for (int i = 1; i <= value; i++){
            result = result * i;
        }
        System.out.println(result);
    }
}
