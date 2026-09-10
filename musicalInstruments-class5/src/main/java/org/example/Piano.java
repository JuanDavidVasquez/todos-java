package org.example;

public class Piano implements InstrumentoMusical{
    @Override
    public void afinar() {
        System.out.println("Afinar Piano");
    }
    @Override
    public void tocar() {
        System.out.println("Tocar Piano");
    }
}
