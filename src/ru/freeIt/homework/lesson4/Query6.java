package ru.freeIt.homework.lesson4;

import java.util.Random;

//Создайте массив из 4 случайных целых чисел из отрезка [0;10], выведите его
//        на экран в строку. Определить и вывести на экран сообщение о том, является ли
//        массив строго возрастающей последовательностью
public class Query6 {
    public static void main(String[] args) {
        int[] array = new int[4];
        boolean flag = true;

        Random random = new Random();

        for (int i = 0; i < array.length; i++){
            array[i] = random.nextInt(11);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int i = 1; i < array.length; i++){
            if(array[i] < array[i - 1]){
                flag = false;
            }
        }
        if (flag){
            System.out.println("array increasing");
        }else
            System.out.println("array random");
    }
}
