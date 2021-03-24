package ru.freeIt.homework.fromStudyBook;

import java.util.Random;

//Имеется целове число (задать с помощью Random rand = new Random(); int x =
//        rand.nextInt() ). Это число – количесво денег в рублях. Вывести это число, добавив к
//        нему слово «рублей» в правильном падеже.
public class Query8 {
    public static void main(String[] args) {
        Random random = new Random();
        int value = random.nextInt();
        int tmp1 = value % 10;
        int tmp2 = (value / 10) % 10;

        if ((tmp1 == 2 | tmp1 == 3 | tmp1 == 4) & tmp2 == 1) {
            System.out.println(value + " рублей");
        }else if(tmp1 == 2 | tmp1 == 3 | tmp1 == 4){
            System.out.println(value + " рубля");
        }else if(tmp1 == 1 & tmp2 != 1){
            System.out.println(value + " рубль");
        }else {
            System.out.println(value + " рублей");
        }

    }
}
