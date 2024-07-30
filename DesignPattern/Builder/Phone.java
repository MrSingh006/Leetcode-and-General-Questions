package DesignPattern.Builder;

public class Phone {
    private String os;
    private int ram;
    private int batterySize;
    private double screenSize;
    public Phone(String os, int ram, int batterySize, double screenSize) {
        this.os = os;
        this.ram = ram;
        this.batterySize = batterySize;
        this.screenSize = screenSize;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "os='" + os + '\'' +
                ", ram=" + ram +
                ", batterySize=" + batterySize +
                ", screenSize=" + screenSize +
                '}';
    }
}
