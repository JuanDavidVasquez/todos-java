package org.example;

public abstract class Usuario {

    protected String nombre;
    private String correo;
    private String contraseña;

    public Usuario(String nombre, String correo, String contraseña) {
        this.nombre = nombre;
        setCorreo(correo);
        this.contraseña = contraseña;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        if (correo == null || !correo.contains("@")) {
            throw new IllegalArgumentException("El correo debe contener '@'");
        }
        this.correo = correo;
    }

    public boolean verificarContraseña(String intento) {
        return this.contraseña.equals(intento);
    }

    public abstract void realizarAccion();
}
