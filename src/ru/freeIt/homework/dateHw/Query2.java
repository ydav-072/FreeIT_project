package ru.freeIt.homework.dateHw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;

//2.	По введенной дате вывести возраст
public class Query2 {
    public static void main(String[] args) throws IOException {
        LocalDate nowDate = LocalDate.now();
        System.out.println("Input your birthdate (YYYY-MM-DD): ");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String line = bufferedReader.readLine();
        LocalDate birthDate = LocalDate.parse(line);
        System.out.println(nowDate.getYear() - birthDate.getYear());
    }
}
