package ru.freeIt.homework.lesson2;
//В переменную записываете количество программистов. В зависимости от количества программистов необходимо вывести правильно окончание.
//        Например: • 2 программиста • 1 программиста • 10 программистов • и т.д.

public class Query7 {
    public static void main(String[] args) {
        int value = 22;
        int tmp1 = value % 10;
        int tmp2 = (value / 10) % 10;
        if ((tmp1 == 2 | tmp1 == 3 | tmp1 == 4) & tmp2 == 1) {
            System.out.println(value + " программистов");
        }else if(tmp1 == 2 | tmp1 == 3 | tmp1 == 4){
            System.out.println(value + " программиста");
        }else if(tmp1 == 1 & tmp2 != 1){
            System.out.println(value + " программист");
        }else {
                System.out.println(value + " программистов");
        }
    }
}
