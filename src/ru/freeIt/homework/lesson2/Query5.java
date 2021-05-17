package ru.freeIt.homework.lesson2;
//Даны 3 целых числа. Найти количество положительных и отрицательных чисел в исходном наборе.

public class Query5 {
    public static void main(String[] args) {
        int value1 = 156;
        int value2 = -15;
        int value3 = 0;
        int indexPositive = 0;
        int indexNegative = 0;

        if (value1 > 0) {
            indexPositive++;
        } else if (value1 < 0) {
            indexNegative++;
        }
        if (value2 > 0) {
            indexPositive++;
        } else if (value2 < 0) {
            indexNegative++;
        }
        if (value3 > 0) {
            indexPositive++;
        } else if (value3 < 0) {
            indexNegative++;
        }
        System.out.println(" положительных чисел: " + indexPositive + "; отрицательных: " + indexNegative);
//        findPositiveAndNegative(value1, value2, value3);
    }
//    public static void findPositiveAndNegative(int a, int b, int c){
//        int[] arr = {a, b, c};
//        int indexPositive = 0;
//        int indexNegative = 0;
//
//        for (int i = 0; i < arr.length; i++){
//            if (arr[i] > 0){
//                indexPositive++;
//            }else{
//                indexNegative++;
//            }
//        }
//        System.out.println(" положительных чисел: " + indexPositive + "; отрицательных: " + indexNegative);
//    }
}