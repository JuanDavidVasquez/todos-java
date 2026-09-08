package org.example;

public class Main {

    public static void main(String[] args) {
        Usuario[] usuarios = new Usuario[2];

        usuarios[0] = new Cliente("Ana Pérez", "ana@correo.com", "clave123", 5);
        usuarios[1] = new Cajero("Luis Gómez", "luis@correo.com", "caja456", "Centro");

        for (int i = 0; i < usuarios.length; i++) {
            usuarios[i].realizarAccion();
        }
    }
}
