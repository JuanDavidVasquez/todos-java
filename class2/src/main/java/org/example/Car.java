package org.example;

public class Car extends Vehiculo {
    public Car(
            double speed,
            double acceleration,
            double time,
            double breaking
    ){
        super(speed, acceleration, time, breaking);
    }
    @Override
    public void showInfo(){
        System.out.println("Carro");
    }
}
