package ru.freeIt.homework.lesson4;
import java.util.Random;

//Создайте 2 массива из 5 случайных целых чисел из отрезка [0;15] каждый,
//        выведите массивы на экран в двух отдельных строках. Посчитайте среднее
//        арифметическое элементов каждого массива и сообщите, для какого из
//        массивов это значение оказалось больше (либо сообщите, что их средние
//        арифметические равны).
public class Query5 {
    public static void main(String[] args) {
        int[] array1 = new int[5];
        int[] array2 = new int[5];

        Random random = new Random();
        for (int i = 0; i < array1.length; i++){
            array1[i] = random.nextInt(16);
            System.out.print(array1[i] + " ");
            array2[i] = random.nextInt(16);
        }
        System.out.println();
        for (int i = 0; i < array2.length; i++){
            System.out.print(array2[i] + " ");
        }

        System.out.println();
        if (averageSearch(array1) > averageSearch(array2)){
            System.out.println("average array1 > array2");
        }else if (averageSearch(array1) < averageSearch(array2)){
            System.out.println("average array1 < array2");
        }else
            System.out.println("average array1 = array2");
    }
    public static double averageSearch(int[] arr){
        double average= 0;
        for (int i = 0; i < arr.length; i++){
            average+= arr[i];
        }
        return average = average / arr.length;
    }
}
