package org.example.adapter;

public class TestClassAdapter {
    public static void main(String[] args) {
        MemoryCard memoryCard = new MemoryCard();
        USBDevice adapter = new MemoryCardAdapter(memoryCard);
        Computer computer = new Computer();

        computer.readUSBDevice(adapter);
    }
}
