package org.example;

public class Ship implements Transport {

    @Override
    public void deliver(Envio envio) {
        System.out.println("Enviando \"" + envio.getCargo() + "\" (" + envio.getPeso()
                + " kg) a " + envio.getDestino() + " por mar en un contenedor.");
    }
}
