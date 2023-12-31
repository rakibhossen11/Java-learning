package ClassAndObj;

public class Main {
    public static void main(String[] args) {
        // create object led and helogen
        Lamp led = new Lamp();
        Lamp helogen = new Lamp();

        // turn on the light by
        // calling method turn on
        led.turnOn();

        // turn off the light by
        // calling turn off method
        helogen.turnOff();
    }
}

class Lamp {
    boolean isOn;

    // method to turn on the light
    void turnOn() {
        isOn = true;
        System.out.println("Light on " + isOn);
    }

    // method to turn off the light
    void turnOff() {
        isOn = false;
        System.out.println("Light off " + isOn);
    }

}
