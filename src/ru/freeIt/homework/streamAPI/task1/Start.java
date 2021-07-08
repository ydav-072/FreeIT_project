package ru.freeIt.homework.streamAPI.task1;

//Создать свой функциональный интерфейс для вывода на консоль данных объекта.
//С помощью лямбда-выражения вывести данные для объектов типа String и Integer.
public class Start {
    public static void main(String[] args) {
        Tree pine = new Tree("pine", 40);
        Tree baobab = new Tree("baobab", 90);

        CustomFunctionInterface customFunctionInterface = a -> {
            System.out.println(a.getName());
            System.out.println(a.getAge());
        };

        customFunctionInterface.printInfo(pine);
        customFunctionInterface.printInfo(baobab);
    }
}
