package ru.freeIt.homework.exceptionHW;
//Создать собственное исключение
//        - Создать класс Car c полями (марка, скорость, цена), конструкторы (с
//        параметрами и default) гетеры-сетеры.
//        Создать метод старт в котором пытаетесь завести автомобиль. В методе старт
//        генерируете случайное число от 0 до 20, если полученное число оказалось
//        четным, то выбрасываете созданное ранее вами исключение и передаете его к
//        месту откуда вызывали метод старт. Если все хорошо и исключение не
//        вылетело, то выводить в консоль сообщение что автомобиль с такой-то маркой
//        завелся.
public class Query1 {
    public static void main(String[] args) {
        Car car1 = new Car("Mazda", 220, 30000);
        Car car2 = new Car("Suzuki", 180, 20000);
        Car car3 = new Car("Volvo", 200, 35000);

        try {
            car1.start();
            car2.start();
            car3.start();
        }catch (StartException exception){
            System.out.println(exception.getExcStartNumber());
            System.out.println(exception.getMessage());
        }
    }
}
