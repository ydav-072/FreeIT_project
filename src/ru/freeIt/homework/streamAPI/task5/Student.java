package ru.freeIt.homework.streamAPI.task5;

public class Student {
    private String name;
    private String secondName;
    private int numberClass;

    public Student(String name, String secondName, int numberClass) {
        this.name = name;
        this.secondName = secondName;
        this.numberClass = numberClass;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public int getNumberClass() {
        return numberClass;
    }

    public void setNumberClass(int numberClass) {
        this.numberClass = numberClass;
    }
}
