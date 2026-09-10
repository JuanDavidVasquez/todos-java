package org.example;

public class Guitarra implements InstrumentoMusical {
    @Override
    public void tocar() {
        System.out.println("Tocar Guitarra");
    }
    @Override
    public void afinar() {
        System.out.println("Afinar Guitarra");
    }
}
