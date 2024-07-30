package DesignPattern.Builder;

public class PhoneBuilder {
    private String os;
    private int ram;
    private int batterySize;
    private double screenSize;

    public PhoneBuilder setOs(String os) {
        this.os = os;
        return this;
    }

    public PhoneBuilder setRam(int ram) {
        this.ram = ram;
        return this;
    }

    public PhoneBuilder setBatterySize(int batterySize) {
        this.batterySize = batterySize;
        return this;
    }

    public PhoneBuilder setScreenSize(double screenSize) {
        this.screenSize = screenSize;
        return this;
    }
    public Phone getPhone()
    {
        return new Phone(os,ram,batterySize,screenSize);
    }
}
