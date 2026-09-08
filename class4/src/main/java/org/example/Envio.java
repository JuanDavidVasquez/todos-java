package org.example;

public class Envio {
    private String cargo;
    private String destino;
    private double peso;

    public Envio(String cargo, String destino, double peso) {
        this.cargo = cargo;
        this.destino = destino;
        this.peso = peso;
    }

    public String getCargo() {
        return cargo;
    }

    public String getDestino() {
        return destino;
    }

    public double getPeso() {
        return peso;
    }
}
