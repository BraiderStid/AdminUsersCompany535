package com.mycompany.adminuserscompany535;

public class Administrador extends Usuario {


    public Administrador(String nombre, String email) {
        super(nombre, email, "Administrador");
    }


    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Este es un administrador. Tiene permisos completos.");
    }


    public void gestionarUsuarios() {
        System.out.println("El administrador puede crear, eliminar o modificar usuarios.");
    }
}
