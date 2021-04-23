package ru.freeIt.homework.lesson12;
//Сеарилизовать объект Автомобиль(Марка, скорость, цена). После
//        сериализации произвести обратный процесс

import java.io.*;

public class Query4 {
    public static void main(String[] args) {
        Automobile automobile = new Automobile("Mazda", 200, 30000);
        System.out.println(automobile.toString());
        String path = "src/ru/freeIt/homework/lesson12/resource";
        String fileName = "auto.txt";
        serializeInFile(automobile, path, fileName);
        Automobile automobile1 = deserializeFromFile(path, fileName);
        System.out.println(automobile1.getBrand());
    }

    public static void serializeInFile(Object o, String path, String fileName){
        try(FileOutputStream fileOutputStream = new FileOutputStream(new File(path, fileName));
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)){
            objectOutputStream.writeObject(o);
        }catch (FileNotFoundException exception){
            System.out.println("Can't find file");
            exception.printStackTrace();
        } catch (IOException exception){
            System.out.println("Can't write obj :(");
            exception.printStackTrace();
        }
    }

    public static Automobile deserializeFromFile(String path, String fileName){
        Automobile automobile = null;
        try(FileInputStream fileInputStream = new FileInputStream(new File(path, fileName));
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)){
            automobile = (Automobile)objectInputStream.readObject();
        }catch (FileNotFoundException exception){
            System.out.println("Can't find file");
            exception.printStackTrace();
        } catch (IOException exception){
            System.out.println("Can't write obj :(");
            exception.printStackTrace();
        }catch (ClassNotFoundException exception){
            System.out.println("Can't read class :((");
            exception.printStackTrace();
        }
        return automobile;
    }
}

