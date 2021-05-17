package ru.freeIt.homework.fromStudyBook;
//Имеется 4500 секунд. Вывести в консоль содержащихся в этом количестве секунд:
//        А) минут + секунд,
//        В) часов + минут + секунд,
//        С) дней + часов + минут + секунд,
//        D) недель + дней + часов + минут + секунд.
//        по аналогии с примером выше.
public class Query3 {
    public static void main(String[] args) {
        int sec = 4500;
        System.out.println(sec + " sec is: ");

        int s = sec % 60;
        int min = (sec - s) / 60;
        System.out.println(min + " minutes and " + s + "sec");

        int m = min % 60;
        int hours = (min - m) / 60;
        System.out.println(hours + " hours " + m + " minutes and " + s + " sec");

        int h = hours % 24;
        int day = (hours - h) / 24;
        System.out.println(day + " days " + hours + " hours " + m + " minutes and " + s + " sec");

        int d = day % 7;
        int week = (day - d) / 7;
        System.out.println(week + " weeks " + day + " days " + hours + " hours " + m + " minutes and " + s + " sec");
    }
}
