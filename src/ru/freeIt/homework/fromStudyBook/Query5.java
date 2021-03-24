package ru.freeIt.homework.fromStudyBook;
//Дано любое натуральное 4-х значное число. Верно ли, что все цифры числа
//        различны?
public class Query5 {
    public static void main(String[] args) {
        int value = 2353;
        int tmp = 0;

        tmp = value % 10;
        value = (value - tmp) / 10;
        int result1 = tmp;

        tmp = value % 10;
        value = (value - tmp) / 10;
        int result2 = tmp;

        tmp = value % 10;
        value = (value - tmp) / 10;
        int result3 = tmp;

        tmp = value % 10;
        value = (value - tmp) / 10;
        int result4 = tmp;

        if (result1 != result2 & result1 != result3 & result1 != result4 & result2 != result4 & result2 != result3 & result3 != result4){
            System.out.println( "all numbers are various");
        } else{
            System.out.println("got reply numbers");
        }
    }
}
