package ru.freeIt.homework.lesson2;
//Даны 3 целых числа. Найти количество положительных чисел в исходном наборе.
public class Query4 {
    public static void main(String[] args) {
        int value1 = 156;
        int value2 = -15;
        int value3 = -16;
        int index = 0;

        if (value1 > 0){
            index++;
        }
        if (value2 > 0){
            index++;
        }
        if (value3 > 0){
            index++;
        }
        System.out.println(" положительных чисел: " + index);
//        findPositive(value1, value2, value3);
    }
//    public static void findPositive(int a, int b, int c){
//        int[] arr = {a, b, c};
//        int index = 0;
//
//        for (int i = 0; i < arr.length; i++){
//            if (arr[i] > 0){
//                index++;
//            }
//        }
//        System.out.println(" положительных чисел: " + index);
//    }
}
