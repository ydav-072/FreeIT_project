package ru.freeIt.homework.dateHw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.Month;

// По введенной дате вывести название месяца.
public class Query1 {
    public static void main(String[] args) throws IOException {
        String line;
        System.out.println("Please enter Date in (YYYY-MM-DD): ");
        BufferedReader bufferedReader  = new BufferedReader(new InputStreamReader(System.in));
        line = bufferedReader.readLine();
        Month month = LocalDate.parse(line).getMonth();
        System.out.println(month);
    }
}
