package ru.freeIt.homework.lesson3;
//Составьте программу, вычисляющую A*B, не пользуясь операцией умножения.

public class Query4 {
    public static void main(String[] args) {
        int a = 3;
        int b = 8;
        int res = 0;
        for (int j = 0; j < b; j++){
            res = res + a;
        }
        System.out.println(res);
    }
}
