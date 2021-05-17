package ru.freeIt.homework.lesson4;
//Создайте массив из всех чётных чисел от 2 до 20 и выведите элементы
//        массива на экран сначала в строку, отделяя один элемент от другого пробелом, а
//        затем в столбик (отделяя один элемент от другого началом новой строки). Перед
//        созданием массива подумайте, какого он будет размера.
public class Query1 {
    public static void main(String args[]){
        int[] array = new int[10];
        int value  = 20;
        int index = 0;

        for (int i = 2; i <= value; i++){
            if (i % 2 == 0){
                array[index] = i;
                System.out.print(array[index] + " ");
                index++;
            }
        }
        System.out.println();
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}