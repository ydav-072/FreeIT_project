package ru.freeIt.homework.lesson4;
import java.util.Random;

//Создайте массив из 15 случайных целых чисел из отрезка [0; 99]. Выведите
//        массив на экран. Подсчитайте сколько в массиве чётных элементов и выведете
//        это количество на экран на отдельной строке
public class Query3 {
    public static void main(String[] args) {
        int[] array = new int[15];
        int evenNumbers = 0;
        Random random = new Random();
        for(int i = 0; i < array.length; i++){
            array[i] = random.nextInt(99)+1;
            System.out.println(array[i]);
            if(array[i] % 2 == 0){
                evenNumbers++;
            }
        }
        System.out.println("Even numbers in arr: " + evenNumbers);
    }

}