package org.example;

public class Cliente extends Usuario {

    private int mesa;

    public Cliente(String nombre, String correo, String contraseña, int mesa) {
        super(nombre, correo, contraseña);
        this.mesa = mesa;
    }

    @Override
    public void realizarAccion() {
        System.out.println(nombre + " (cliente) está haciendo un pedido desde la mesa " + mesa);
    }
}
