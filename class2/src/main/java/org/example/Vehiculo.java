package org.example;

public abstract class Vehiculo {

    private double speed;
    private double acceleration;
    private double time;
    private double braking;

    public Vehiculo(
            double speed,
            double acceleration,
            double time,
            double braking
    ) {
        this.speed = speed;
        this.acceleration = acceleration;
        this.time = time;
        this.braking = braking;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getAcceleration() {
        return acceleration;
    }

    public double getTime() {
        return time;
    }

    public double getBraking() {
        return braking;
    }

    public abstract void showInfo();
}