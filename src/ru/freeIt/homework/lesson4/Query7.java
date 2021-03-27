package ru.freeIt.homework.lesson4;

import java.util.Random;

//Создайте массив из 12 случайных целых чисел из отрезка [0;15]. Определите
//        какой элемент является в этом массиве максимальным и сообщите индекс его
//        последнего вхождения в массив.
public class Query7 {
    public static void main(String[] args) {
        int[] array = new int[12];
        int index = 0;
        int maxValue;

        Random random = new Random();

        for (int i = 0; i < array.length; i++){
            array[i] = random.nextInt(16);
            System.out.print(array[i] + " ");
        }

        System.out.println();
        maxValue = array[0];
        for (int i = 1; i < array.length; i++){
            if (array[i] >= maxValue){
                maxValue = array[i];
                index = i;
            }
        }
        System.out.println(index);
    }
}
