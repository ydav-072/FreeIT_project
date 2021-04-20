package ru.freeIt.homework.collectionHw;

import java.util.*;

//Создать список оценок учеников с помощью ArrayList, заполнить случайными
//        оценками. Найти самую высокую оценку с использованием итератора.
public class Query3 {
    public static void main(String[] args) {
        Integer maxMark = 0;
        List<Integer> arrMarks = new ArrayList<Integer>(20);
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            arrMarks.add(i, random.nextInt(11));
        }

        ListIterator<Integer> integerListIterator = arrMarks.listIterator();
        while (integerListIterator.hasNext()) {
            if (maxMark < integerListIterator.next()) {
                maxMark = integerListIterator.previous();
            }
        }
        System.out.println(maxMark);
    }
}
