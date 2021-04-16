package ru.freeIt.homework.dateHw;

import java.text.SimpleDateFormat;
import java.util.Date;
//3.	Вывести дату в формате даты (DD/MM/YYYY) + время hh:mm:ss

public class Query3 {
    public static void main(String[] args) {
        String dateFormat = new SimpleDateFormat("d-MMM-yyyy hh:mm:ss").format(new Date());
        System.out.println(dateFormat);
    }
}
