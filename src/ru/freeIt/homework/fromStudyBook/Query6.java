package ru.freeIt.homework.fromStudyBook;
//Создайте число. Определите, является ли число трехзначным. Определите, является
//        ли его последняя цифра семеркой. Определите, является ли число четным.
public class Query6 {
    public static void main(String[] args) {
        int value = 158;
        int tmp = value;
        int countOfNumbers = 0;
        for ( ; tmp != 0 ; tmp /= 10){
            ++countOfNumbers;
        }
        if (countOfNumbers == 3){
            System.out.println(" число 3-ёх значное");
        }
        if (value % 10 == 7){
            System.out.println(" число заканчивается на 7");
        }
        if (value % 2 == 0){
            System.out.println(" число четное");
        }

    }
}
