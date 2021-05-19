package ru.freeIt.homework.xmlHW;
//Создать xml-файл, хранящий информацию об объектах предметной области ниже. Для валидации полученного xml-файла необходимо разработать соответствующую xsd схему.
//        1. Общие требования:
//        - Простые и комплексные типы
//        - Шаблоны и предельные значения
//        - Обязательно использование атрибутов и типа ID
//        - Задание атрибутов по умолчанию
//        2. Произвести проверку XML-документа с помощью XSD.
//        3. Предметная область:
//        Компьютерные комплектующие:
//        - Name - название комплектующего
//        - Origin - страна производства
//        - Price - цена (0 - n USD)
//        - Type (должно быть несколько)
//        - периферийное либо нет, энергопотребление (ватт), наличие кулера( есть или нет), группа комплектующих (устройства ввода-вывода, мультимедийные), порты (COM, USB, LPT)
//        - Critical - критично ли наличие комплектующего для работы компьютера.
//        Корневой элемент назвать Devices

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Start {
    public static void main(String[] args) {
        File fileXml = new File("src/ru/freeIt/homework/xmlHW/resource/Devices.xml");
        File fileXsd = new File("ru/freeIt/homework/xmlHW/Validation.xsd");
        File createFile = new File("src/ru/freeIt/homework/xmlHW/resource/Create.xml");


        Electronics electronics = new Electronics(3, "Palit", "Taiwan", 800, Electronics.Type.VideoCard,
                Electronics.IsAre.TRUE, 400, Electronics.IsAre.TRUE, Electronics.Interface.PCIx16E, Electronics.IsAre.FALSE);
        List<Electronics> electronicsListToFile = new ArrayList<>();
        electronicsListToFile.add(electronics);

        Device deviceToFile = new Device();

        deviceToFile.setDevice(electronicsListToFile);

        XmlBuilder xmlBuilder = new XmlBuilder();
        xmlBuilder.writeToXmlFile(deviceToFile, createFile);

        Device deviceFromFile = new Device();
        deviceFromFile = xmlBuilder.readFromFileToObj(fileXml);
        System.out.println(deviceFromFile.getDevice().get(0).toString());

        xmlBuilder.validation(fileXml, fileXsd);

    }
}
