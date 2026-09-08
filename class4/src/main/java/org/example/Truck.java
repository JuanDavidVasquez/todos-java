package org.example;

public class Truck implements Transport {

    @Override
    public void deliver(Envio envio) {
        System.out.println("Enviando \"" + envio.getCargo() + "\" (" + envio.getPeso()
                + " kg) a " + envio.getDestino() + " por tierra en una caja.");
    }
}
