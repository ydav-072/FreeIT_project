package ru.freeIt.homework.lesson5;
//Найти в строке не только запятые, но и другие знаки препинания. Подсчитать
//        общее их количество.
public class Query18 {
    public static void main(String[] args) {

        String str = "Строковый литерал — это последовательность символов,\n" +
                "заключенных в двойные кавычки.";
        int flag = 0;
        char symbol;

        for (int i = 0; i < str.length(); i++){
            symbol = str.charAt(i);
            if (symbol == ',' || symbol == '.' || symbol == '—'){
                flag++;
            }
        }
        System.out.println("Value of punctuation marks: " + flag);
    }
}