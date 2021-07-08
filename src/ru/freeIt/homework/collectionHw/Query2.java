package ru.freeIt.homework.collectionHw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

//Создать коллекцию, наполнить ее случайными числами. Удалить повторяющиеся
//        числа.
public class Query2 {
    public static void main(String[] args) {
        Random random = new Random();

        List<Integer> arrList = new ArrayList<Integer>(30);
        for (int i = 0; i < 10; i++){
            arrList.add(random.nextInt(15));
        }
        System.out.println(arrList);
        Collections.sort(arrList);
        for (int i = 1; i < arrList.size(); i++){
            if (arrList.get(i-1) == arrList.get(i)){
                arrList.remove(i);
            }
        }
        System.out.println(arrList);
    }
}
