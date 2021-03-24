package ru.freeIt.homework.fromStudyBook;
//Имеется прямоугольное отверстие размерами a и b, определить, можно ли его
//        полностью закрыть круглой картонкой радиусом r
public class Query7 {
    public static void main(String[] args) {
        int a = 15;
        int b = 19;
        int radius = 10;

        if ((a * b) <= (Math.pow(radius, 2)*Math.PI*2)){
            System.out.println(" можно закрыть, при условии что центр круга на центре прямоугольника");
        }else {
            System.out.println(" нельзя закрыть, при условии что центр круга на центре прямоугольника");
        }
    }
}
