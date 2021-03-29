package ru.freeIt.homework.lesson4;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

//Пользователь вводит с клавиатуры число большее 3, которое сохраняется в
//        переменную n. Если пользователь ввёл не подходящее число, то программа
//        должна выдать соответствующее сообщение. Создать массив из n случайных
//        целых чисел из отрезка [0;n] и вывести его на экран. Создать второй массив
//        только из чётных элементов первого массива, если они там есть, и вывести его
//        на экран.
public class Query10 {
    public static void main(String[] args) throws IOException {
        int n;
        int index = 0;
        int[] array;
        int[] array2;
        int lengthTwiceArray = 0;

        Random random = new Random();

        System.out.println("Please input number more than 3: ");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(bufferedReader.readLine());

        if (n < 3){
            System.out.println("You enter wrong number, please, try again > 3: ");
            n = Integer.parseInt(bufferedReader.readLine());
        }

        array = new int[n];

        for (int i = 0; i < array.length; i++){
            array[i] = random.nextInt(n+1);
            System.out.print(array[i] + " ");
            if (array[i] % 2 == 0 & array[i] != 0){
                lengthTwiceArray++;
            }
        }
        System.out.println();
        array2 = new int[lengthTwiceArray];
        for (int i = 0; i < array.length; i++){
            if (array[i] % 2 == 0 & array[i] != 0){
                array2[index] = array[i];
                System.out.print(array2[index] + " ");
                index++;

            }
        }
    }
}

