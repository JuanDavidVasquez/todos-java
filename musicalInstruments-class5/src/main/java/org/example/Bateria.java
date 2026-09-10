package org.example;

public class Bateria implements InstrumentoMusical {
    @Override
    public void tocar() {
        System.out.println("Tocar Bateria");
    }
    @Override
    public void afinar() {
        System.out.println("Afinar Bateria");
    }
}
