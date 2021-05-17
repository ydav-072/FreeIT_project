package ru.freeIt.homework.fromStudyBook;
//Имеется целое число, определить является ли это число простым, т.е.
//        делится без остатка только на 1 и себя
public class Query11 {
    public static void main(String[] args) {
        int value = 15;
        int i = 2;
        for (; i < value - 1; i++) {
            if (value % i == 0) {
                break;
            }
        }
        if (i == (value - 1)) {
            System.out.println("простое");
        } else
            System.out.println("не простое");
    }
}
