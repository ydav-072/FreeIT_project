package ru.freeIt.homework.collectionHw;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//Создать список оценок учеников с помощью ArrayList, заполнить случайными
//        оценками. Удалить неудовлетворительные оценки из списка.
public class Query1 {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> arrayMarks = new ArrayList<Integer>(30);
        for (int i = 0; i < 30; i++){
            arrayMarks.add(random.nextInt(11));
        }
        System.out.println(arrayMarks);

        for (int i = 0; i < arrayMarks.size(); i++){
            if (arrayMarks.get(i) <= 3){
                arrayMarks.remove(i);
            }
        }
        System.out.println(arrayMarks);
    }
}
