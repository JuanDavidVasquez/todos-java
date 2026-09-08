package org.example;

public class Cajero extends Usuario {

    private String sucursal;

    public Cajero(String nombre, String correo, String contraseña, String sucursal) {
        super(nombre, correo, contraseña);
        this.sucursal = sucursal;
    }

    @Override
    public void realizarAccion() {
        System.out.println(nombre + " (cajero) está registrando un cobro en la sucursal " + sucursal);
    }
}
