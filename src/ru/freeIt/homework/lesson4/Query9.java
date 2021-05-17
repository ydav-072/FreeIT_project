package ru.freeIt.homework.lesson4;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

//Пользователь должен указать с клавиатуры положительное число, а
//        программа должна создать массив указанного размера из случайных целых
//        чисел из [0;15] и вывести его на экран в строку. После этого программа должна
//        определить и сообщить пользователю о том, сумма какой половины массива
//        больше: левой или правой, либо сообщить, что эти суммы модулей равны. Еслипользователь введёт неподходящее число, то выдать соответствующее
//        сообщение
public class Query9 {
    public static void main(String[] args) throws IOException {

        int[] array;
        int leftSum = 0;
        int rightSum = 0;
        int lengthArray;

        Random random = new Random();

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input positive number of length array: ");
        lengthArray = Integer.parseInt(bufferedReader.readLine());

        if (lengthArray < 0){
            System.out.println("Error input, please input number > 0: ");
            lengthArray = Integer.parseInt(bufferedReader.readLine());
        }

        array = new int[lengthArray];

        for (int i = 0; i < array.length; i++){
            array[i] = random.nextInt(16);
            System.out.print(array[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < array.length / 2; i++){
            leftSum+= array[i];
        }

        for (int i = array.length / 2; i < array.length; i++){
            rightSum+= array[i];
        }

        if (leftSum > rightSum){
            System.out.println("Left half of array is more than right");
        }else if (rightSum > leftSum){
            System.out.println("Right half of array is more than left");
        }else
            System.out.println("Left and right half of array is equals");

    }
}
