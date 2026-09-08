package org.example;

public class Actions {

    public void startUp(Vehiculo vehiculo) {

        double newSpeed =
                vehiculo.getSpeed()
                        + (vehiculo.getAcceleration() * vehiculo.getTime());

        vehiculo.setSpeed(newSpeed);

        System.out.println("Velocidad: " + newSpeed);
    }

    public void stop(Vehiculo vehiculo) {

        double stopTime =
                vehiculo.getSpeed() / vehiculo.getBraking();

        vehiculo.setSpeed(0);

        System.out.println(
                "Tiempo para detenerse: "
                        + stopTime
                        + " segundos"
        );

        System.out.println("Vehículo detenido");
    }
}