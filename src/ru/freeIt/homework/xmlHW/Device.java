package ru.freeIt.homework.xmlHW;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "Devices")
@XmlAccessorType(XmlAccessType.FIELD)
public class Device {
    @XmlElement(name = "Electronics")
    private List<Electronics> Device;

    public Device(List<Electronics> device) {
        Device = device;
    }

    public Device() {
    }

    public List<Electronics> getDevice() {
        return Device;
    }

    public void setDevice(List<Electronics> device) {
        Device = device;
    }
}
