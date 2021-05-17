package ru.freeIt.homework.fromStudyBook;
//Найдите сумму первых n целых чисел, которые делятся на 3
public class Query12 {
    public static void main(String[] args) {
        int value = 10;
        searchSumInRange(value);
        searchSumInQuantity(value);
    }

    public static void searchSumInRange(int n){
        int sum = 0;
        for (int i = 0; i <= n; i++){
            if(i % 3 == 0){
                sum+= i;
            }
        }
        System.out.println(sum);
    }

    public static void searchSumInQuantity(int n){
        int sum = ((3 + 3 * n) / 2) * n; // сумма арифметической прогрессии
        System.out.println(sum);
    }
}
