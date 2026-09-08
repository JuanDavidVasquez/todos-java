package org.example;

public class Cycle extends Vehiculo {
    public Cycle(
            double speed,
            double acceleration,
            double time,
            double braking
    ) {
        super(speed, acceleration, time, braking);
    }
    @Override
    public void showInfo() {
        System.out.println("Soy una cicla");
    }
}
