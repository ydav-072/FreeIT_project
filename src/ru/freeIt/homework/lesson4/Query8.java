package ru.freeIt.homework.lesson4;
import java.util.Random;

//Создайте два массива из 10 целых случайных чисел из отрезка [0;9] и третий
//        массив из 10 действительных чисел. Каждый элемент с i-ым индексом третьего
//        массива должен равняться отношению элемента из первого массива с i-ым
//        индексом к элементу из второго массива с i-ым индексом. Вывести все три
//        массива на экран (каждый на отдельной строке), затем вывести количество
//        целых элементов в третьем массиве
public class Query8 {
    public static void main(String[] args) {
        int n = 10;
        int[] array1 = new int[n];
        int[] array2 = new int[n];
        double[] array3 = new double[n];
        int valueWholeNumbers = 0;

        Random random = new Random();

        for (int i = 0; i < n; i++){
            array1[i] = random.nextInt(9) + 1;
            System.out.print(array1[i] + " ");
            array2[i] = random.nextInt(9) + 1;
            array3[i] = (double)array1[i] / array2[i];
        }

        System.out.println();
        for (int i = 0; i < array2.length; i++){
            System.out.print(array2[i] + " ");
        }

        System.out.println();
        for (int i = 0; i < array3.length; i++){
            System.out.print(array3[i] + " ");
        }

        System.out.println();
        for (int i = 0; i < array3.length; i++){
            if (array3[i] % 1 == 0){
                valueWholeNumbers++;
            }
        }
        System.out.println(valueWholeNumbers);
    }
}
