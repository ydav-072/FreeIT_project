package ru.freeIt.homework.lesson3;
//Вычислить: 1+2+4+8+...+256

public class Query3 {
    public static void main(String[] args) {
        int value = 1;
        int tmp = 1;
        while(value < 256){
            tmp = tmp * 2;
            value = tmp + value;
        }
        System.out.println(value);
    }
}
