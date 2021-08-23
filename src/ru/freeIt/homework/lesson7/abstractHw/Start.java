package ru.freeIt.homework.lesson7.abstractHw;

public class Start {
    public static void main(String[] args) {
        LightTransport lightTransport = new LightTransport("coupe", 2, 12, "porshe",
                                                            80, 400,1200, 4);
        System.out.println(lightTransport.descriptionObject(4));
    }
}
