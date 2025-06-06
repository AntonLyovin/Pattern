package org.example.adapter;

public class Computer {
    public void readUSBDevice(USBDevice device){
        System.out.println("Компьютер считывает данные");
        device.readData();
    }
}
