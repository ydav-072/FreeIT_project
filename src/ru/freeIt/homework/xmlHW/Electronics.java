package ru.freeIt.homework.xmlHW;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "Electronics")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlSeeAlso({Device.class})
@XmlType(propOrder = {"id", "name", "origin", "price", "type", "peripheral", "energy", "isCooler", "interfaces", "isCritical"})
public class Electronics {
    @XmlAttribute
    private int id;
    private String name;
    private String origin;
    private double price;
    private Type type;
    private IsAre peripheral;
    private int energy;
    private IsAre isCooler;
    private Interface interfaces;
    private IsAre isCritical;

    public Electronics(int id, String name, String origin, double price, Type type, IsAre peripheral, int energy, IsAre isCooler, Interface interfaces, IsAre isCritical) {
        this.id = id;
        this.name = name;
        this.origin = origin;
        this.price = price;
        this.type = type;
        this.peripheral = peripheral;
        this.energy = energy;
        this.isCooler = isCooler;
        this.interfaces = interfaces;
        this.isCritical = isCritical;
    }

    public Electronics() {
    }

    enum Type {
        Motherboard,
        Laptop,
        Desktop,
        Processor,
        HDD,
        VideoCard
    }

    enum Interface {
        USB,
        COM,
        LPT,
        PCIx16E
    }

    enum IsAre {
        TRUE,
        FALSE
    }


}
