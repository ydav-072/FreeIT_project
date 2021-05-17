package ru.freeIt.homework.lesson2;
//        В переменную записываем число. Надо вывести на экран сколько в этом числе цифр и положительное оно или отрицательное.
//        Например, "это однозначное положительное число". Достаточно будет определить, является ли число однозначным, двузначным или трехзначным и более.

public class Query1 {
    public static void main(String[] args) {
        int value = -123;
        int tmp = (value < 0) ? -value : value;
        int index = 0;

        for (int i = 0; tmp > 0; i++){
            tmp = tmp / 10;
            index++;
        }
        switch (index){
            case 0:
                System.out.println("Ваше число равно 0");
                break;
            case 1:
                if (value > 0) {
                    System.out.println("это однозначное положительное число");
                } else {
                    System.out.println("это однозначное отрицательное число");
                }
                break;
            case 2:
                if (value > 0) {
                    System.out.println("это двузначное положительное число");
                } else {
                    System.out.println("это двузначное отрицательное число");
                }
                break;
            case 3:
                if (value > 0) {
                    System.out.println("это трехзначное положительное число");
                } else {
                    System.out.println("это трехзначное отрицательное число");
                }
                break;
            case 4:
                if (value > 0) {
                    System.out.println("это четырёхзначное положительное число");
                } else {
                    System.out.println("это четырёхзначное отрицательное число");
                }
                break;
            default:
                System.out.println("Вы ввели неоднозначное число");
                break;
        }
    }
}
