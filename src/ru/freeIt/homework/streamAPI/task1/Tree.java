package ru.freeIt.homework.streamAPI.task1;

public class Tree {
    private String name;
    private int age;

    public Tree(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Tree() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
