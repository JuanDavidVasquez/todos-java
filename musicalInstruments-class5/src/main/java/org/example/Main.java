package org.example;

public class Main {
    public static void main(String[] args) {
        InstrumentoMusical[] instrumentos = {
                new Guitarra(),
                new Piano(),
                new Bateria()
        };

        for (InstrumentoMusical instrumento : instrumentos) {
            instrumento.afinar();
            instrumento.tocar();
        }
    }
}
