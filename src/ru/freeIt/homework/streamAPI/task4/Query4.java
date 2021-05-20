package ru.freeIt.homework.streamAPI.task4;

import java.util.Arrays;
import java.util.Random;

//Задать массив чисел. Используя средства Stream API вывести на консоль нечетные
//        значения
public class Query4 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(15);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        Arrays.stream(array).filter(number -> number % 2 != 0).forEach(a -> System.out.print(a + " "));
    }
}
